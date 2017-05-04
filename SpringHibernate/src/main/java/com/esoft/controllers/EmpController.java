package com.esoft.controllers;

import com.esoft.model.Department;
import com.esoft.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.esoft.service.EmpManagerService;
import java.util.List;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmpController {

    @Autowired
    private EmpManagerService empmanager;

    @RequestMapping(value = "/emptable", method = RequestMethod.GET)
    public String viewEmpList(ModelMap model) {
        List<Employee> empList = empmanager.getEmployeelist();
        for (Employee employee : empList) {
            System.out.println("empController emplist : " + employee.getEmp_name() + " " + employee.getEmp_address());
        }
        model.addAttribute("employees", empList);
        return "home";
    }

    @RequestMapping(value = "/edituser", method = RequestMethod.GET)
    public String editEmployee(
            @RequestParam(value = "userid") int emp_id,
            ModelMap model) {
        for (Department e : empmanager.getDepartmentList()) {
            System.out.println(e.getDep_name());
        }
        model.addAttribute("employee", empmanager.getEmployeeById(emp_id));
        model.addAttribute("departmentlist", empmanager.getDepartmentList());
        return "edit";
    }

    @RequestMapping(value = "/saveuser", method = RequestMethod.GET)
    public String saveUser(
            @RequestParam(value = "user_id") int emp_id,
            @RequestParam(value = "dep_id") int dep_id
//            @RequestParam(value = "user_name") String emp_name,
//            @RequestParam(value = "user_age") String emp_age,
//            @RequestParam(value = "user_address") String emp_address         
    ) {
        Employee employee = empmanager.getEmployeeById(emp_id);
//        employee.setEmp_name(emp_name);
//        employee.setEmp_age(emp_age);
//        employee.setEmp_address(emp_address);
        employee.setDepartment(empmanager.getDepartmentByID(dep_id));        
        empmanager.updateEmployee(employee);
        System.out.println(emp_id+" "+dep_id);
        return "redirect:/emptable";
    }
}
