package com.gaur.springboot.controller;

import com.gaur.springboot.model.Users;
import com.gaur.springboot.service.UserService;
import com.gaur.springboot.service.UserDetailsServiceImp;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDetailsServiceImp userDetailsServiceImp;

    @Autowired
    private UserService userService;

    @GetMapping("sessionId")
    public String getSessionId(HttpServletRequest httpServletRequest){
        return "getSessionId  - " + httpServletRequest.getSession().getId();
    }

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest httpServletRequest){
        return (CsrfToken) httpServletRequest.getAttribute("_csrf");
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users users){
            return userService.createUser(users);
    }

    @GetMapping("/allUsers")
    public List<Users> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/login")
    public String login(@RequestBody Users users){
        System.out.println(users);
        return userService.verify(users);
    }

}
