package com.example.jpademo.service;
//
//import com.example.jpademo.entity.Person;
//import com.example.jpademo.jdbc.PersonJdbcDao;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Service;
//
//import java.util.Date;
//
//@Service
//public class PersonService implements CommandLineRunner {
//    Date date=java.util.Calendar.getInstance().getTime();
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    PersonJdbcDao personJdbcDao;
//
//    @Override
//    public void run(String... args) throws Exception {
//        logger.info("All Users -> {}",personJdbcDao.findAll());
//        logger.info("User id 1001 -> {}", personJdbcDao.findById(1001));
//        //logger.info("User updated -> {}",personJdbcDao.updateById(1003));
//        logger.info("Inserting 1004 -> {}",personJdbcDao.insert (new Person(1004,"Tokyo","Berlin",date)));
//        logger.info("Inserting 1004 -> {}",personJdbcDao.insert (new Person(1005,"Ragna","Professor",date)));
//        logger.info("Updating 1004 -> {}",personJdbcDao.update (new Person(1003,"Moscow","lila",date)));
//        logger.info("User name -> {}",personJdbcDao.findByName("Ragna"));
//        //logger.info("User deleted by name -> {}", personJdbcDao.deleteByName("Ragna"));
//    }
//}
