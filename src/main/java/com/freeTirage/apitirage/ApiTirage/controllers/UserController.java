package com.freeTirage.apitirage.ApiTirage.controllers;

import com.freeTirage.apitirage.ApiTirage.models.User;
import com.freeTirage.apitirage.ApiTirage.repository.UserRepository;
import com.freeTirage.apitirage.ApiTirage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("/api")
@Controller
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @PostMapping("/create")
    public User create(User user){
        return userService.creerUser(user);
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getAll();
    }
}
