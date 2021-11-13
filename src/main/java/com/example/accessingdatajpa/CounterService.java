package com.example.accessingdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterService {
    @Autowired
    private CounterRepository counterRepository;

    public Counter findOne(long id) {
        return counterRepository.findById(id);
    }

    public Counter save(Counter counter) {
        return counterRepository.save(counter);
    }

}
