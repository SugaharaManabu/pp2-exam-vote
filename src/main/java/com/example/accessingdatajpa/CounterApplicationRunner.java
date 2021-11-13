package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CounterApplicationRunner implements ApplicationRunner {
    @Autowired
    private CounterRepository counterRepository;

    @Override
    public void run(ApplicationArguments args) {
        counterRepository.save(new Counter(0, 0));
    }
}
