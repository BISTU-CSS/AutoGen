package com.autogen.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class atgController {

    @GetMapping("/hello")
    String hello() {
        return "hello";
    }

}
