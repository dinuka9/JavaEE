package com.esoft.service;

import java.util.List;

import com.esoft.model.Department;
import com.esoft.model.Employee;

public interface EmpManagerService {
	List<Employee> getEmployeelist();

	Employee getEmployeeById(int emp_id);

	Department getDepartmentByID(int dep_id);
        
        List<Department> getDepartmentList();
        
        void updateEmployee(Employee employee);
}
