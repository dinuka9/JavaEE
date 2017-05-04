package com.esoft.dao;

import java.util.List;

import com.esoft.model.Department;
import com.esoft.model.Employee;

public interface EmpManagerDAO {
	public List<Employee> getEmployeelist();

	public Employee getEmployeeById(int emp_id);

	public Department getDepartmentByID(int dep_id);
        
        public List<Department> getDepartmentList();
        
        public void updateEmployee(Employee emp);
}
