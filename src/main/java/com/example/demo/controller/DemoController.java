package com.example.demo.controller;

import com.example.demo.models.RandomText;
import com.example.demo.service.DemoService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class DemoController {
    private final DemoService demoService;



    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @PostMapping("/text")
    public ResponseEntity<RandomText> saveText(@RequestBody @Validated RandomText text) {
        demoService.saveText(text);
        return new ResponseEntity<>(text,HttpStatus.OK);
    }

    @GetMapping("/text")
    public ResponseEntity<RandomText> getRandomText() {
        RandomText randomText=new RandomText();
        randomText.setText(demoService.getRandomText());
        return new ResponseEntity<>(randomText,HttpStatus.OK);
    }
}