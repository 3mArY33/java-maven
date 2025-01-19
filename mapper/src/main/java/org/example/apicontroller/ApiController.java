package org.example.apicontroller;

import org.example.UserDTO.UserDTO;
import org.example.mapper.UserMapper;
import org.example.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world!";
    }

    @GetMapping("/users")
    public List<UserDTO> getUsers() {
        User user1 = new User();
        user1.setName("Jan Kowalski");
        user1.setAge(30);

        User user2 = new User();
        user2.setName("Anna Nowak");
        user2.setAge(25);

        UserDTO userDTO1 = UserMapper.INSTANCE.userToUserDTO(user1);
        UserDTO userDTO2 = UserMapper.INSTANCE.userToUserDTO(user2);

        return Arrays.asList(userDTO1, userDTO2);
    }
}
