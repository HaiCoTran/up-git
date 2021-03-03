package com.tco.demospringboot.service;

import com.tco.demospringboot.entity.User;
import com.tco.demospringboot.repository.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserServiceImpl  implements  UserService{
    @Autowired
    private com.tco.demospringboot.repository.userDao userDao;
    @Override
    public List<User> getListUser() {
        return userDao.getDataUser();
    }
}
