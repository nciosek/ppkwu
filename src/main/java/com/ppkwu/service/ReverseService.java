package com.ppkwu.service;

import org.springframework.stereotype.Component;

@Component
public class ReverseService {

    public int getLengthOfText(String text) {
        return text.length();
    }

    public boolean hasUpperCaseLetters(String text) {
        return !text.equals(text.toLowerCase());
    }

    public boolean hasLowerCaseLetters(String text) {
        return text.equals(text.toLowerCase());
    }

    public boolean hasAnySpecialSymbols(String text) {
        return !text.chars().allMatch(Character::isLetter);
    }

    public boolean hasAnyWhiteSpace(String text) {
        return text.contains(" ");
    }

    public boolean isDigit(String text) {
        return text.matches("\\d+(\\.\\d+)?");
    }

    public int getNumberOfUpperCaseLetters(String text) {
        return (int) text.codePoints()
                .filter(c -> c >= 'A' && c <= 'Z')
                .count();
    }

    public int getNumberOfLowerCaseLetters(String text) {
        return (int) text.codePoints()
                .filter(c -> c >= 'a' && c <= 'z')
                .count();
    }

    public int getNumberOfWhiteSpaces(String text) {
        int spaceCounter = 0;

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                spaceCounter++;
            }
        }
        return spaceCounter;
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

    public String reverse(String data) {
        StringBuilder input = new StringBuilder();
        input.append(data);
        return input.reverse().toString();
    }

}