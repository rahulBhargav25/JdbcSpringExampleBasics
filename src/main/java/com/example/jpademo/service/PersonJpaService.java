package com.example.jpademo.service;

import com.example.jpademo.jpa.PersonJpaRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class PersonJpaService implements CommandLineRunner {
    @Autowired
    PersonJpaRepo personJpaRepo;
    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Override
    public void run(String... args) throws Exception {
        logger.info("indo on all users -> {}", personJpaRepo.findById(1001));
    }
}
