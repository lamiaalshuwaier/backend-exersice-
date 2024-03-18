package com.example.demo.service;

import com.example.demo.models.RandomText;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.Random;

@Service
public class DemoService {
    @Autowired
    DemoRepository demoRepository;

    public void saveText(RandomText text) {

        demoRepository.save(text);
    }

    public String getRandomText() {
        int textsCount=demoRepository.findAll().size();
        Random random = new Random();
        int index = random.nextInt(textsCount);
        Optional <RandomText> randomText=demoRepository.findById((Long.valueOf(index+1))); // adding 1 as random.nextint max value is exclusive

        if (!randomText.isPresent()) {
            return "Not lucky no text returned";
        }
        return randomText.get().getText();
    }
}