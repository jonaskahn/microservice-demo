package com.tuyen.demo.profile.service;

import com.tuyen.demo.profile.dao.ProfileRepository;
import com.tuyen.demo.profile.domain.EmployeeProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeProfileServiceImpl implements EmployeeProfileService {

    private final ProfileRepository repository;

    List<EmployeeProfile> employeeProfileList = new ArrayList<>();

    public EmployeeProfileServiceImpl(ProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public void addEmployeeProfile(EmployeeProfile profile) {
        repository.save(profile);
    }

    @Override
    public List<EmployeeProfile> getEmployeeProfiles() {
        return repository.findAll();
    }
}