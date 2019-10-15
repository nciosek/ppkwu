package com.ppkwu.controller;

import com.ppkwu.service.ReverseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/validate/{data}")
    public String validate(@PathVariable String data) {
        return reverseService.validate(data);
    }

    @GetMapping("/length/{data}")
    public ResponseEntity<Integer> getLengthOfText(@PathVariable String data) {
        Integer lengthOfText = reverseService.getLengthOfText(data);
        return ResponseEntity.ok(lengthOfText);
    }

    @GetMapping("/contain/whitespace/{data}")
    public ResponseEntity<Boolean> hasAnyWhiteSpace(@PathVariable String data) {
        Boolean hasAnyWhiteSpace = reverseService.hasAnyWhiteSpace(data);
        return ResponseEntity.ok(hasAnyWhiteSpace);
    }

    @GetMapping("/contain/uppercase/{data}")
    public ResponseEntity<Boolean> hasAnyUpperCaseLetter(@PathVariable String data) {
        Boolean hasAnyUpperCase = reverseService.hasUpperCaseLetters(data);
        return ResponseEntity.ok(hasAnyUpperCase);
    }

    @GetMapping("/contain/lowercase/{data}")
    public ResponseEntity<Boolean> hasAnyLowerCaseLetter(@PathVariable String data) {
        Boolean hasAnyLowerCase = reverseService.hasLowerCaseLetters(data);
        return ResponseEntity.ok(hasAnyLowerCase);
    }

    @GetMapping("/contain/specialsymbol/{data}")
    public ResponseEntity<Boolean> hasAnySpecialSymbol(@PathVariable String data) {
        Boolean hasAnySpecialSymbol = reverseService.hasAnySpecialSymbols(data);
        return ResponseEntity.ok(hasAnySpecialSymbol);
    }

    @GetMapping("/digit/{data}")
    public ResponseEntity<Boolean> isDigit(@PathVariable String data) {
        Boolean isDigit = reverseService.isDigit(data);
        return ResponseEntity.ok(isDigit);
    }

    @GetMapping("/count/uppercase/{data}")
    public ResponseEntity<Integer> getNumberOfUpperCaseLetters(@PathVariable String data) {
        Integer numberOfUpperCaseLetters = reverseService.getNumberOfUpperCaseLetters(data);
        return ResponseEntity.ok(numberOfUpperCaseLetters);
    }

    @GetMapping("/count/lowercase/{data}")
    public ResponseEntity<Integer> getNumberOfLowerCaseLetters(@PathVariable String data) {
        Integer numberOfLowerCaseLetters = reverseService.getNumberOfLowerCaseLetters(data);
        return ResponseEntity.ok(numberOfLowerCaseLetters);
    }

    @GetMapping("/count/whitespaces/{data}")
    public ResponseEntity<Integer> getNumberOfWhiteSpaces(@PathVariable String data) {
        Integer numberOfWhiteSpaces = reverseService.getNumberOfWhiteSpaces(data);
        return ResponseEntity.ok(numberOfWhiteSpaces);
    }

    @GetMapping("/reverse/{data}")
    public String rev(@PathVariable String data) {
        return reverseService.reverse(data);
    }

}

