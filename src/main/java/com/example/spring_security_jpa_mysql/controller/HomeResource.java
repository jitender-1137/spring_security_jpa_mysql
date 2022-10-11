package com.example.spring_security_jpa_mysql.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource extends BaseController {

    @GetMapping("/")
    public String home() {
        return "Welcome !!!";
    }

    @GetMapping("/user")
    public String user() {
        return "Welcome user !!!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Welcome admin !!!";
    }
}
