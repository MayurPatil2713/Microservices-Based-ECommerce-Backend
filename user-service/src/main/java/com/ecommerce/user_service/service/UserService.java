package com.ecommerce.user_service.service;

import com.ecommerce.user_service.security.JwtService;
import com.ecommerce.user_service.dto.LoginRequest;
import com.ecommerce.user_service.dto.UserDTO;
import com.ecommerce.user_service.entity.User;
import com.ecommerce.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.Optional;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public User registerUser(UserDTO userDTO) {

        User user = new User();

        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setRole("USER");

        return userRepository.save(user);
    }

    public String loginUser(LoginRequest loginRequest) {

        Optional<User> optionalUser = userRepository.findByEmail(loginRequest.getEmail());

        if (optionalUser.isEmpty()) {
        return "User not found!";
        }
        User user = optionalUser.get();
        if (passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
        return jwtService.generateToken(user.getEmail());
        } else {
        return "Invalid Password!";
        }
    }
}