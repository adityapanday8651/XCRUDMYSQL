package com.test.manager.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.filter.SearchRequest;
import com.test.manager.DepartmentManager;
import com.test.model.Department;
import com.test.repository.DepartmentRepository;

@Service
public class DepartmentManagerImpl implements DepartmentManager{
	
	@Autowired 
	private DepartmentRepository deptRepo;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return deptRepo.save(department);
	}

	@Override
	public List<Department> fetchDepartmentList() {
		// TODO Auto-generated method stub
		return (List<Department>)deptRepo.findAll();
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		// TODO Auto-generated method stub
		
		Department depDB=deptRepo.findById(departmentId).get();
		
		 if (Objects.nonNull(department.getDepartmentName())
		            && !"".equalsIgnoreCase(
		                department.getDepartmentName())) {
			 depDB.setDepartmentName(department.getDepartmentName());
		 }
		 if (Objects.nonNull(
	                department.getDepartmentAddress())
	            && !"".equalsIgnoreCase(
	                department.getDepartmentAddress())) {
	            depDB.setDepartmentAddress(
	                department.getDepartmentAddress());
	        }
	 
	        if (Objects.nonNull(department.getDepartmentCode())
	            && !"".equalsIgnoreCase(
	                department.getDepartmentCode())) {
	        	depDB.setDepartmentCode(
	                    department.getDepartmentCode());
	            }
		return deptRepo.save(depDB);
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		deptRepo.deleteById(departmentId);
	}

	@Override
	public List<Department> search(SearchRequest request, String sellerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long searchCount(SearchRequest request, String sellerId) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
