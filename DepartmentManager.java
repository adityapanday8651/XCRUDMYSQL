package com.test.manager;

import java.util.List;


import com.test.model.Department;
import com.test.service.core.AbstractService;

public interface DepartmentManager extends AbstractService<Department>{
	Department saveDepartment(Department department);
	List<Department> fetchDepartmentList();
	Department updateDepartment(Department department,Long departmentId);
	void deleteDepartmentById(Long departmentId);

}
