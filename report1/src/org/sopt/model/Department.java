package org.sopt.model;

public class Department extends University{

    //학과 고유번호,이름,전화번호,학과타입(공대 자연대 등)
    private int departmentIdx;
    private String departmentName;
    private String departmentPhone;
    private String departmentType;

    public Department(int departmentIdx, String departmentName, String departmentPhone, String departmentType) {
        this.departmentIdx = departmentIdx;
        this.departmentName = departmentName;
        this.departmentPhone = departmentPhone;
        this.departmentType = departmentType;
    }

    public Department(int universityIdx, String universityName, String universityPhone, String universityAddress,
                      int departmentIdx, String departmentName, String departmentPhone, String departmentType) {
        super(universityIdx, universityName, universityPhone, universityAddress);
        this.departmentIdx = departmentIdx;
        this.departmentName = departmentName;
        this.departmentPhone = departmentPhone;
        this.departmentType = departmentType;
    }

    public Department() {}

    public int getDepartmentIdx() { return departmentIdx; }

    public void setDepartmentIdx(int departmentIdx) {
        this.departmentIdx = departmentIdx;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentPhone() {
        return departmentPhone;
    }

    public void setDepartmentPhone(String departmentPhone) {
        this.departmentPhone = departmentPhone;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentIdx=" + departmentIdx +
                ", departmentName='" + departmentName + '\'' +
                ", departmentPhone='" + departmentPhone + '\'' +
                ", departmentType='" + departmentType + '\'' +
                '}';
    }
}
