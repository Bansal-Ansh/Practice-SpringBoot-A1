package com.bansal.test1.service;

import com.bansal.test1.entity.Department;
import error.DepartmentNotFound;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchdepartmentById(Long departmentId) throws DepartmentNotFound;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}
