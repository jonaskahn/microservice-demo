package com.tuyen.demo.usermanagement.dao;

import com.tuyen.demo.usermanagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}