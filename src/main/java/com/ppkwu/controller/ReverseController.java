package com.ppkwu.controller;

import com.ppkwu.service.ReverseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {

    private ReverseService reverseService;

    @Autowired
    public ReverseController(ReverseService sampleService) {
        this.reverseService = sampleService;
    }

    @GetMapping("/reverse/{data}")
    public String rev(@PathVariable String data) {
        return reverseService.reverse(data);
    }

    @GetMapping("/validate/{data}")
    public String validate(@PathVariable String data) {
        return reverseService.validate(data);
    }
}

