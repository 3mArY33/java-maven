package org.example.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.example.UserDTO.UserDTO;
import org.example.mapper.UserMapper;
import org.example.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Users", description = "Operacje na użytkownikach")
public class UserController {

    @Operation(summary = "Pobierz użytkownika po identyfikatorze", description = "Zwraca dane użytkownika na podstawie jego ID")
    @GetMapping("/api/users/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        User user = new User();
        user.setName("Jan Kowalski");
        user.setAge(30);

        UserDTO userDTO = UserMapper.INSTANCE.userToUserDTO(user);
        return userDTO;
    }
}
