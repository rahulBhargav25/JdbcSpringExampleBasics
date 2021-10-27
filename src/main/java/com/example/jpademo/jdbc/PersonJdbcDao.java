package com.example.jpademo.jdbc;

import com.example.jpademo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Repository
public class PersonJdbcDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
            person.setName(rs.getString("name"));
            person.setLocation(rs.getString("location"));
            person.setBirthDate(rs.getDate("birth_date"));
            return person;
        }
    }
    //select * from person
    public List<Person> findAll() {
        String sql = "select * from person";
        return jdbcTemplate.query(sql, new PersonRowMapper());
    }


    public List<Person> findById(int id) {
        String sql = "select * from person where id=?";
        return jdbcTemplate.query(sql, new Object[] {id},new BeanPropertyRowMapper<Person>(Person.class));
    }

    public List<Person> findByName(String name) {
        String sql="select * from person where name=?";
        return jdbcTemplate.query(sql,new Object[] {name}, new PersonRowMapper());
    }

    public int updateById(int id) {
        String sql = "delete person where id=?";
        return  jdbcTemplate.update(sql, new Object[] {id});
    }
    public int deleteByName(String name) {
        String sql="delete person where name=?";
        return jdbcTemplate.update(sql,new Object[]{name});
    }
    public int insert(Person person) {
        String sql = "insert into person (id,name,location,birth_date) "
                +"values(?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[] {person.getId(), person.getName(),person.getLocation(),person.getBirthDate()});
    }

    public int update(Person person) {
        String sql = "update person set name=? , location=? , birth_date=? "
                +" where id=?";
        return jdbcTemplate.update(sql, new Object[] {person.getName(),person.getLocation(),person.getBirthDate(),person.getId()});
    }



}
