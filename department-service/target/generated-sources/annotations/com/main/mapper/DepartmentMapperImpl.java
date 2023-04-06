package com.main.mapper;

import com.main.dto.DepartmentDto;
import com.main.entity.Department;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-06T03:06:52+0200",
    comments = "version: 1.5.3.Final, compiler: Eclipse JDT (IDE) 1.4.200.v20220802-0458, environment: Java 17.0.4.1 (Eclipse Adoptium)"
)
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public Department unmap(DepartmentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Department department = new Department();

        department.setDepartmentCode( dto.getDepartmentCode() );
        department.setDepartmentDescription( dto.getDepartmentDescription() );
        department.setDepartmentName( dto.getDepartmentName() );
        department.setId( dto.getId() );

        return department;
    }

    @Override
    public DepartmentDto map(Department dept) {
        if ( dept == null ) {
            return null;
        }

        DepartmentDto departmentDto = new DepartmentDto();

        departmentDto.setDepartmentCode( dept.getDepartmentCode() );
        departmentDto.setDepartmentDescription( dept.getDepartmentDescription() );
        departmentDto.setDepartmentName( dept.getDepartmentName() );
        departmentDto.setId( dept.getId() );

        return departmentDto;
    }
}
