package org.sopt.model;

public class Student extends Department {

    //학번,이름,학년,학과,이메일,주소,나이,현재상태(재학휴학 등)
    private int studentIdx;
    private String studentName;
    private String studentGrade;
    private String studentMajor;
    private String studentEmail;
    private String studentAddress;
    private String studentAge;
    private String studentState;

    public Student(int studentIdx, String studentName, String studentGrade, String studentMajor, String studentEmail, String studentAddress, String studentAge, String studentState) {
        this.studentIdx = studentIdx;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentMajor = studentMajor;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentState = studentState;
    }

    public Student(int universityIdx, String universityName, String universityPhone, String universityAddress,
                   int departmentIdx, String departmentName, String departmentPhone, String departmentType,
                   int studentIdx, String studentName, String studentGrade, String studentMajor,
                   String studentEmail, String studentAddress, String studentAge, String studentState) {
        super(universityIdx, universityName, universityPhone, universityAddress, departmentIdx, departmentName, departmentPhone, departmentType);
        this.studentIdx = studentIdx;
        this.studentName = studentName;
        this.studentGrade = studentGrade;
        this.studentMajor = studentMajor;
        this.studentEmail = studentEmail;
        this.studentAddress = studentAddress;
        this.studentAge = studentAge;
        this.studentState = studentState;
    }

    public Student() {}

    public int getStudentIdx() {
        return studentIdx;
    }

    public void setStudentIdx(int studentIdx) {
        this.studentIdx = studentIdx;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentState() {
        return studentState;
    }

    public void setStudentState(String studentState) {
        this.studentState = studentState;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentIdx=" + studentIdx +
                ", studentName='" + studentName + '\'' +
                ", studentGrade='" + studentGrade + '\'' +
                ", studentMajor='" + studentMajor + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentAge='" + studentAge + '\'' +
                ", studentState='" + studentState + '\'' +
                '}';
    }
}
