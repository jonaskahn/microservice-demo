package com.tuyen.demo.profile.service;

import com.tuyen.demo.profile.domain.EmployeeProfile;

import java.util.List;

public interface EmployeeProfileService {

    void addEmployeeProfile(EmployeeProfile profile);

    List<EmployeeProfile> getEmployeeProfiles();
}