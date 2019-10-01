package com.ppkwu.service;

public class ReverseService {

    public String reverse(String str){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        return stringBuilder.reverse().toString();
    }

    public String validate(String data){
        StringBuilder result = new StringBuilder();
        if (data.chars().anyMatch(v -> v >= 48 && v <= 57)){
            result.append("numbers");
        }
        return null;
    }
}
