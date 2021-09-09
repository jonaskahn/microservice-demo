package com.tuyen.demo.usermanagement.service;

import com.tuyen.demo.usermanagement.domain.User;

import java.util.List;

public interface UserService {

    void add(User user);

    List<User> find();
}
