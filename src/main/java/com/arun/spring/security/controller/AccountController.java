package com.arun.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    
    @GetMapping("/account")
    public String getAccountDetails() {
        return "Details of the account";
    }
}
