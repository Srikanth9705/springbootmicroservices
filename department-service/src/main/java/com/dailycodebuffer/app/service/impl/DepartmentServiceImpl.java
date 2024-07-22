package com.dailycodebuffer.app.service.impl;

import com.dailycodebuffer.app.entity.Department;
import com.dailycodebuffer.app.repository.DepartmentRepository;
import com.dailycodebuffer.app.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department getDepartmentById(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.orElse(null);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department updateDepartment(Long id, Department department) {
        if (departmentRepository.existsById(id)) {
            department.setDeptId(id); // Ensure the department id is set correctly
            return departmentRepository.save(department);
        }
        return null; // or throw an exception as per your requirement
    }

    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
