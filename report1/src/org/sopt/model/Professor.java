package org.sopt.model;

public class Professor extends Department{

    //교수 고유번호,이름,학과,전화번호, 담당과목
    private int professorIdx;
    private String professorName;
    private String professorMajor;
    private String professorPhone;
    private String professorSubject;

    public Professor(int professorIdx, String professorName, String professorMajor, String professorPhone, String professorSubject) {
        this.professorIdx = professorIdx;
        this.professorName = professorName;
        this.professorMajor = professorMajor;
        this.professorPhone = professorPhone;
        this.professorSubject = professorSubject;
    }

    public Professor(int universityIdx, String universityName, String universityPhone, String universityAddress,
                     int departmentIdx, String departmentName, String departmentPhone, String departmentType,
                     int professorIdx, String professorName, String professorMajor, String professorPhone, String professorSubject) {
        super(universityIdx, universityName, universityPhone, universityAddress, departmentIdx, departmentName, departmentPhone, departmentType);
        this.professorIdx = professorIdx;
        this.professorName = professorName;
        this.professorMajor = professorMajor;
        this.professorPhone = professorPhone;
        this.professorSubject = professorSubject;
    }

    public Professor() {}

    public int getProfessorIdx() {
        return professorIdx;
    }

    public void setProfessorIdx(int professorIdx) {
        this.professorIdx = professorIdx;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorMajor() {
        return professorMajor;
    }

    public void setProfessorMajor(String professorMajor) {
        this.professorMajor = professorMajor;
    }

    public String getProfessorPhone() {
        return professorPhone;
    }

    public void setProfessorPhone(String professorPhone) {
        this.professorPhone = professorPhone;
    }

    public String getProfessorSubject() {
        return professorSubject;
    }

    public void setProfessorSubject(String professorSubject) {
        this.professorSubject = professorSubject;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "professorIdx=" + professorIdx +
                ", professorName='" + professorName + '\'' +
                ", professorPhone='" + professorPhone + '\'' +
                ", subject='" + professorSubject + '\'' +
                '}';
    }
}
