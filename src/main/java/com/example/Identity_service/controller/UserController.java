package com.example.Identity_service.controller;

import com.example.Identity_service.dto.request.UserCreationRequest;
import com.example.Identity_service.dto.request.UserUpdateRequest;
import com.example.Identity_service.entity.User;
import com.example.Identity_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User creatUser(@RequestBody @Valid UserCreationRequest request) {
        return userService.createUser(request);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") String userId) {
        return userService.getUser(userId);
    }

    @PutMapping("/{userId}")
    public User updateUser( @PathVariable("userId") String userId,@RequestBody UserUpdateRequest request) {
        return userService.updateUser(userId, request);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable("userId") String userId) {
         Boolean isDeleted = userService.deleteUser(userId);
         if (isDeleted) {
             return "User has been deleted";
         }else {
             return "User is not deleted";
         }

    }
}
