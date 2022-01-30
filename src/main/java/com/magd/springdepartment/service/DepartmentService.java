package com.magd.springdepartment.service;

import com.magd.springdepartment.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);


    List<Department> fetchAllDepartments();

    Department fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartmentById(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
