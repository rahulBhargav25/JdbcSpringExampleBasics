package com.example.jpademo;

import com.example.jpademo.jpa.PersonJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class JpaDemoApplication {
    @Autowired
    PersonJpaRepo personJpaRepo;

    public static void main(String[] args) {
        SpringApplication.run(JpaDemoApplication.class, args);
    }


}
