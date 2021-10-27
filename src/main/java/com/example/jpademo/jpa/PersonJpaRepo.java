package com.example.jpademo.jpa;

import com.example.jpademo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepo {
    //connect to the database

    @PersistenceContext
    EntityManager entityManager;
    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }
}
