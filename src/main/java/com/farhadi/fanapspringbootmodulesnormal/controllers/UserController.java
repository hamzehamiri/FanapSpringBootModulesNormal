package com.farhadi.fanapspringbootmodulesnormal.controllers;

import com.farhadi.fanapspringbootmodulesnormal.dto.UserDTO;
import com.farhadi.fanapspringbootmodulesnormal.entities.UserEntity;
import com.farhadi.fanapspringbootmodulesnormal.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/create")
    public void create(@RequestBody UserDTO userEntity) {
        userService.addUser(userEntity);
    }

    @DeleteMapping("/delete")
    public void delete(Long uuid) {
        userService.deleteById(uuid);
    }

    @GetMapping("/findAll")
    public List<UserEntity> findAll() {
        return userService.findAll();
    }
}
