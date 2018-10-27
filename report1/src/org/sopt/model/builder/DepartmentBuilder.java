package org.sopt.model.builder;

import org.sopt.model.Department;

public class DepartmentBuilder {

    private int departmentIdx;
    private String departmentName;
    private String departmentPhone;
    private String departmentType;

    public DepartmentBuilder setDepartmentIdx(final int departmentIdx){
        this.departmentIdx = departmentIdx;
        return this;
    }

    public DepartmentBuilder setDepartmentName(final String departmentName){
        this.departmentName = departmentName;
        return this;
    }

    public DepartmentBuilder setDepartmentPhone(final String departmentPhone){
        this.departmentPhone = departmentPhone;
        return this;
    }

    public DepartmentBuilder setDepartmentType(final String departmentType){
        this.departmentType = departmentType;
        return this;
    }

    public Department build(){
        return new Department(this.departmentIdx, this.departmentName, this.departmentPhone, this.departmentType);
    }
}
