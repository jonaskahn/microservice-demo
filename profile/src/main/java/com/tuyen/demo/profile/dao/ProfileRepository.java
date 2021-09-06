package com.tuyen.demo.profile.dao;

import com.tuyen.demo.profile.domain.EmployeeProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<EmployeeProfile, Integer> {

}