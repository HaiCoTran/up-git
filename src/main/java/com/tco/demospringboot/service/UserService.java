package com.tco.demospringboot.service;

import com.tco.demospringboot.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public List<User> getListUser();
}
