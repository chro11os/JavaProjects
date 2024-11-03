package service;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {
        @Autowired
        private UserRepository userRepository;

        public User registerUser(User user) {
            return userRepository.save(user);
        }

        public Optional<User> findUserByUsername(String username) {
            return userRepository.findByUsername(username);
        }

        public Optional<User> findUserByEmail(String email) {
            return userRepository.findByEmail(email);
        }

}
