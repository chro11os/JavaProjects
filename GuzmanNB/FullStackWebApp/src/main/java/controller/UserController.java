package controller;

import DTOs.UserDTO;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserDTO userDTO) {
        // Check if the email is already registered
        if (userService.findUserByEmail(userDTO.getEmail()).isPresent()) {
            return new ResponseEntity<>("Email already registered", HttpStatus.BAD_REQUEST);
        }

        // Register the new user using the updated service method
        userService.registerUser(userDTO);
        return new ResponseEntity<>("User registered successfully", HttpStatus.CREATED);
    }

}
