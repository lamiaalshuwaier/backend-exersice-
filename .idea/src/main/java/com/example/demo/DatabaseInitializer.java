/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.example.demo.models.RandomText;
import com.example.demo.repository.DemoRepository;

@Component
public class DatabaseInitializer implements ApplicationRunner {
     private final DemoRepository demoRepository;
     
       @Autowired
    public DatabaseInitializer(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        // Create a table and insert data
        RandomText text1 = new RandomText();
        text1.setText("{\"text\":\"Initialization Text\"}");
        demoRepository.save(text1);
    }
}
