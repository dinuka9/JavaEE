package lk.dinuka.hibernate_only_annotation;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "tbl_employee")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name = "emp_id")
    private int emp_id;

    @Column(name = "emp_name")
    private String emp_name;

    @Column(name = "emp_age")
    private String emp_age;

    @Column(name = "emp_address")
    private String emp_address;

    @ManyToOne
    @JoinColumn(name = "emp_dep_id")
    private Department department;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_age() {
        return emp_age;
    }

    public void setEmp_age(String emp_age) {
        this.emp_age = emp_age;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
