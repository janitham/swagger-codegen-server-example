package com.swagger.microservice.testservice.controllers;

import com.swagger.microservice.testservice.User;
import io.swagger.api.UserApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class UserController implements UserApi {
    @Override
    public ResponseEntity<Void> createUser(@Valid User body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> createUsersWithArrayInput(@Valid List<User> body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> createUsersWithListInput(@Valid List<User> body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUser(String username) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserByName(String username) {
        return null;
    }

    @Override
    public ResponseEntity<String> loginUser(@NotNull @Valid String username, @NotNull @Valid String password) {
        return null;
    }

    @Override
    public ResponseEntity<Void> logoutUser() {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUser(@Valid User body, String username) {
        return null;
    }
}
