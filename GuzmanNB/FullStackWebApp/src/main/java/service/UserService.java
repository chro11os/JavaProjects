package service;

import DTOs.UserDTO;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import util.PasswordEncoderUtil;

import java.util.Optional;

@Service
public class UserService {
        @Autowired
        private UserRepository userRepository;

        public User registerUser(UserDTO userDTO) {
            // Create a new User entity from UserDTO
            User user = new User();
            user.setUsername(userDTO.getUsername());
            user.setEmail(userDTO.getEmail());
            // Encode the password before saving
            user.setPassword(PasswordEncoderUtil.encodePassword(userDTO.getPassword()));

            // Save and return the new User entity
            return userRepository.save(user);
    }


    public Optional<User> findUserByUsername(String username) {
            return userRepository.findByUsername(username);
        }

        public Optional<User> findUserByEmail(String email) {
            return userRepository.findByEmail(email);
        }

        public User reisterUser (User user) {
            user.setPassword(PasswordEncoderUtil.encodePassword(user.getPassword()));
            return userRepository.save(user);
        }
}

