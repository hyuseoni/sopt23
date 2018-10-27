package org.sopt.model.builder;

import org.sopt.model.Student;

public class StudentBuilder {

    private int studentIdx;
    private String studentName;
    private String studentGrade;
    private String studentMajor;
    private String studentEmail;
    private String studentAddress;
    private String studentAge;
    private String studentState;

    public StudentBuilder setStudentIdx(final int studentIdx) {
        this.studentIdx = studentIdx;
        return this;
    }

    public StudentBuilder setStudentName(final String studentName) {
        this.studentName = studentName;
        return this;
    }

    public StudentBuilder setStudentGrade(final String studentGrade) {
        this.studentGrade = studentGrade;
        return this;
    }

    public StudentBuilder setStudentMajor(final String studentMajor) {
        this.studentMajor = studentMajor;
        return this;
    }

    public StudentBuilder setStudentEmail(final String studentEmail) {
        this.studentEmail = studentEmail;
        return this;
    }

    public StudentBuilder setStudentAddress(final String studentAddress) {
        this.studentAddress = studentAddress;
        return this;
    }

    public StudentBuilder setStudentAge(final String studentAge) {
        this.studentAge = studentAge;
        return this;
    }

    public StudentBuilder setStudentState(final String studentState) {
        this.studentState = studentState;
        return this;
    }

    public Student build(){
        return new Student(this.studentIdx, this.studentName, this.studentGrade, this.studentMajor, this.studentEmail, this.studentAddress, this.studentAge, this.studentState);
    }
}
