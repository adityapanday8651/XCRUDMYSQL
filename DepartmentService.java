package com.test.ws;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.test.manager.DepartmentManager;
import com.test.model.Department;

import com.test.model.view.ListResponseView;
import com.test.model.view.ResponseView;

@RestController
@RequestMapping("/dept")
public class DepartmentService extends GenericService{
	@Autowired
	private DepartmentManager departmentManager;
	
	String methodName=null;
	
	@PostMapping("/add")
	public ResponseEntity<Object> addDepartment(@RequestBody Department department){
		ResponseView res=new ResponseView();
		departmentManager.saveDepartment(department);
		res.setMessage("Save Department");
		res.setStatus(true);
		return toSuccess(res);
	}
	
	@GetMapping("/list")
	public ResponseEntity<Object> listDepartment(){
		List<Department> list=departmentManager.fetchDepartmentList();
		return toSuccess(new ListResponseView(list.size(), list));
	}
	
	
	@PutMapping("/update/{id}")
	public Department updateDepartment(@RequestBody Department department,@PathVariable("id") Long departmentId) {
		return departmentManager.updateDepartment(department, departmentId);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDepartment(@PathVariable("id") Long departmentId) {
		departmentManager.deleteDepartmentById(departmentId);
		return "Deleted Successfully";
	}
}
