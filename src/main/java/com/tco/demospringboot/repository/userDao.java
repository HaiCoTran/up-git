package com.tco.demospringboot.repository;

import com.tco.demospringboot.entity.User;
import com.tco.demospringboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class userDao {
    @Autowired
    public JdbcTemplate _jdbcTemplate;
    public List<User> getDataUser() {
        // TODO Auto-generated method stub
        List<User> listuser = new ArrayList<User>();
        String sql = "SELECT *FROM user";
        listuser = _jdbcTemplate.query(sql, new UserMapper());
        return listuser;
    }
}
