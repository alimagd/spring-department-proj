package com.magd.springdepartment.repository;

import com.magd.springdepartment.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentName(String departmentName);

    // TODO: define a special query
    @Query(value = "SELECT * FROM departments d WHERE LOWER(d.departmentName) = ?1",nativeQuery = true)
    Department findByDepartmentNameIgnoreCase(String departmentName);
}
