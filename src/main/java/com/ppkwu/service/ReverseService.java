package com.ppkwu.service;

import org.springframework.stereotype.Component;

@Component
public class ReverseService {

    public String reverse(String data) {
        StringBuilder input = new StringBuilder();
        input.append(data);
        return input.reverse().toString();
    }

    public String validate(String data) {
        StringBuilder result = new StringBuilder();
        if (data.chars().anyMatch(value -> value >= 48 && value <= 57)) {
            result.append("numbers | ");
        }
        if (data.chars().anyMatch(value -> (value >= 97 && value <= 122))) {
            result.append("small letters | ");
        }
        if (data.chars().anyMatch(value -> (value >= 65 && value <= 90))) {
            result.append("big letters | ");
        }
        if (data.chars().anyMatch(value -> (value >= 32 && value <= 47) || (value >= 58 && value <= 64) || (value >= 91 && value <= 96) || (value >= 123))) {
            result.append("special | ");
        }
        return result.toString();
    }
}