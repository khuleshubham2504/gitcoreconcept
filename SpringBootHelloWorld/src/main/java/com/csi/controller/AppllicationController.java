package com.csi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppllicationController {

    @GetMapping
    public String sayHello(){
        return "Welcome to Java";
    }

    @GetMapping("/address")
    public String sayAddress(){
        return "Deothan | Akole| MH";
    }

    @GetMapping("/service")
    public String csiServices(){
        return "Software Development | QR Code Solution Provider";
    }
}
