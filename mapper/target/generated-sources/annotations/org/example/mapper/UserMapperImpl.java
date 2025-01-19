package org.example.mapper;

import javax.annotation.processing.Generated;
import org.example.UserDTO.UserDTO;
import org.example.user.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-19T17:08:26+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        String jan = null;
        int i = 0;

        UserDTO userDTO = new UserDTO( jan, i );

        userDTO.setName( user.getName() );
        userDTO.setAge( user.getAge() );

        return userDTO;
    }
}
