package com.ppkwu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/{str}")
    public String rev(@PathVariable String str){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        return stringBuilder.reverse().toString();
    }

}
