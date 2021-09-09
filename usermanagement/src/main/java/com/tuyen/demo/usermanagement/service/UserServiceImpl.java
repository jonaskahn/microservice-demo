package com.tuyen.demo.usermanagement.service;

import com.tuyen.demo.usermanagement.dao.UserRepo;
import com.tuyen.demo.usermanagement.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo repo;

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public void add(User user) {
        repo.save(user);
    }

    @Override
    public List<User> find() {
        return repo.findAll();
    }
}
