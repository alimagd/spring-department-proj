package com.magd.springdepartment.service;

import com.magd.springdepartment.entity.Department;
import com.magd.springdepartment.exception.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);


    List<Department> fetchAllDepartments();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartmentById(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
