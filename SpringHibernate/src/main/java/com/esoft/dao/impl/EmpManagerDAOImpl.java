package com.esoft.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.esoft.dao.EmpManagerDAO;
import com.esoft.model.Department;
import com.esoft.model.Employee;
import org.hibernate.Query;

@Repository
@Transactional
public class EmpManagerDAOImpl implements EmpManagerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    public List<Employee> getEmployeelist() {
        List<Employee> list = getSession().createQuery("FROM tbl_employee").list();
        return list;
    }

    public Employee getEmployeeById(int emp_id) {
        String hql = "FROM tbl_employee E WHERE E.id = " + emp_id;
        Employee employee = (Employee) getSession().createQuery(hql).uniqueResult();
        return employee;
    }

    public Department getDepartmentByID(int dep_id) {
        String hql = "FROM tbl_department D WHERE D.id = " + dep_id;
        Department department = (Department) getSession().createQuery(hql).uniqueResult();
        return department;
    }

    @Override
    public List<Department> getDepartmentList() {
        List<Department> list = getSession().createQuery("From tbl_department").list();
        return list;
    }

    @Override
    public void updateEmployee(Employee emp) {
        System.out.println("at empdaoimpl : "+emp.getEmp_name());
        String hql = "UPDATE tbl_employee "
//                + "set emp_name =: emp_name, "
//                + "set emp_age =: emp-age, "
//                + "set emp_address =: emp-address, "
                + "set emp_dep_id = :emp_depart_id "
                + " WHERE emp_id = :employee_id ";
        Query query = getSession().createQuery(hql);
        query.setParameter("employee_id", emp.getEmp_id());
//        query.setParameter("emp_name", emp.getEmp_name());
//        query.setParameter("emp-age", emp.getEmp_age());
//        query.setParameter("emp-address", emp.getEmp_address());
        query.setParameter("emp_depart_id", emp.getDepartment().getDep_id());
        int result = query.executeUpdate();
        System.out.println("Rows updated : " + result);
    }

}
