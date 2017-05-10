package lk.dinuka.hibernate_only_annotation;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "tbl_department")
public class Department {
	@Id
	@Column(name = "dep_id")
	private int dep_id;

	@Column(name = "dep_name")
	private String dep_name;

	@Column(name = "dep_description")
	private String dep_description;

//	@OneToMany(mappedBy = "department")
//	private List<Employee> employees;

	public Department() {
		super();
	}

	public Department(int dep_id, String dep_name, String dep_description) {
		super();
		this.dep_id = dep_id;
		this.dep_name = dep_name;
		this.dep_description = dep_description;
	}

	public int getDep_id() {
		return dep_id;
	}

	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getDep_description() {
		return dep_description;
	}

	public void setDep_description(String dep_description) {
		this.dep_description = dep_description;
	}

}
