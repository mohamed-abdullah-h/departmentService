package com.main.service.impl;

//import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.main.dto.DepartmentDto;
import com.main.entity.Department;
import com.main.mapper.DepartmentMapper;
import com.main.repository.DepartmentRepository;
import com.main.service.DepartmentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentRepository departmentRepository;
	// private ModelMapper mapper;
	private DepartmentMapper mapper;

	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {

		/* convert department dto to department jpa entity using Model Mapper
		 * 
		Department department = mapper.map(departmentDto, Department.class);
		Department savedDepartment = departmentRepository.save(department);
		DepartmentDto savedDepartmentDto = mapper.map(savedDepartment, DepartmentDto.class);
		*/
		// convert department dto to department jpa entity using Map Struct
		
		Department department = mapper.unmap(departmentDto);
		Department savedDepartment = departmentRepository.save(department);
		DepartmentDto savedDepartmentDto = mapper.map(savedDepartment);
		return savedDepartmentDto;
	}

	@Override
	public DepartmentDto getDepartmentByCode(String departmentCode) {
		Department department = departmentRepository.findByDepartmentCode(departmentCode);
		/* convert department to department dto using Model Mapper

		DepartmentDto departmentDto = mapper.map(department, DepartmentDto.class);
		*/
		
   //	convert department to department dto using Map Struct
		DepartmentDto departmentDto = mapper.map(department);
		return departmentDto;
	}
}