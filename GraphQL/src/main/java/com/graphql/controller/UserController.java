package com.graphql.controller;

import com.graphql.dto.UserDto;
import com.graphql.entity.User;
import com.graphql.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private  IUserService iUserService;

    @MutationMapping
    public User create(@Argument  String name  , @Argument String email,@Argument String phone,@Argument String password){
        User user = new User();

        user.setName(name);
        user.setEmail(email);
        user.setPhone(phone);
        user.setPassword(password);
        return  iUserService.createUser(user);
    }
    @MutationMapping
    public User createUser(@Argument UserDto userDto){
        User user = new User();

        user.setName(userDto.name());
        user.setEmail(userDto.email());
        user.setPhone(userDto.phone());
        user.setPassword(userDto.password());
        return  iUserService.createUser(user);

    }
}
