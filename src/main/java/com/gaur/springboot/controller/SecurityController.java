package com.gaur.springboot.controller;

import com.gaur.springboot.service.UserDetailsServiceImp;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@RestController
public class SecurityController {

    @Autowired
    private UserDetailsServiceImp userDetailsServiceImp;

    @GetMapping("sessionId")
    public String getSessionId(HttpServletRequest httpServletRequest){
        return "getSessionId  - " + httpServletRequest.getSession().getId();
    }

    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest httpServletRequest){
        return (CsrfToken) httpServletRequest.getAttribute("_csrf");
    }


}
