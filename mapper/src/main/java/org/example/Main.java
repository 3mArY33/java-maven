package org.example;

import org.example.UserDTO.UserDTO;
import org.example.mapper.UserMapper;
import org.example.user.User;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        user.setName("Jan Kowalski");
        user.setAge(30);

        UserMapper userMapper = UserMapper.INSTANCE;
        UserDTO userDTO = userMapper.userToUserDTO(user);

        System.out.println("UserDTO:");
        System.out.println("Name: " + userDTO.getName());
        System.out.println("Age: " + userDTO.getAge());
    }
}
