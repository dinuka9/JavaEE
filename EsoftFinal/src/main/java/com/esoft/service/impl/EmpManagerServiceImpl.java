package com.esoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esoft.dao.EmpManagerDAO;
import com.esoft.model.Department;
import com.esoft.model.Employee;
import com.esoft.service.EmpManagerService;

@Service
public class EmpManagerServiceImpl implements EmpManagerService {

    @Autowired
    EmpManagerDAO empManagerDAO;

    public List<Employee> getEmployeelist() {
        return empManagerDAO.getEmployeelist();
    }

    public Employee getEmployeeById(int emp_id) {
        return empManagerDAO.getEmployeeById(emp_id);
    }

    public Department getDepartmentByID(int dep_id) {
        return empManagerDAO.getDepartmentByID(dep_id);
    }

    @Override
    public List<Department> getDepartmentList() {
        return empManagerDAO.getDepartmentList();
    }

    @Override
    public void updateEmployee(Employee employee) {
        empManagerDAO.updateEmployee(employee);
    }

}
