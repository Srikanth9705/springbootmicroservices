package com.dailycodebuffer.app.service;

import com.dailycodebuffer.app.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department getDepartmentById(Long id);

    public List<Department> getAllDepartments();

    public Department saveDepartment(Department department);

    public Department updateDepartment(Long id, Department department);

    public void deleteDepartment(Long id);

}
