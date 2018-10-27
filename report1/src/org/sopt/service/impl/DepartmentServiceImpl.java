package org.sopt.service.impl;

import org.sopt.model.Department;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentBuilder departmentBuilder = new DepartmentBuilder();

    @Override
    public Department getByDepartmentIdx(int getByDepartmentIdx){
        return departmentBuilder.setDepartmentIdx(getByDepartmentIdx).build();
    }

}
