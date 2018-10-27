package org.sopt.model;

public class University {

    //대학고유번호,이름,전화번호,주소
    private int universityIdx;
    private String universityName;
    private String universityPhone;
    private String universityAddress;

    public University(int universityIdx, String universityName, String universityPhone, String universityAddress) {
        this.universityIdx = universityIdx;
        this.universityName = universityName;
        this.universityPhone = universityPhone;
        this.universityAddress = universityAddress;
    }

    public University() {}

    public int getUniversityIdx() {
        return universityIdx;
    }

    public void setUniversityIdx(int universityIdx) {
        this.universityIdx = universityIdx;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityPhone() {
        return universityPhone;
    }

    public void setUniversityPhone(String universityPhone) {
        this.universityPhone = universityPhone;
    }

    public String getUniversityAddress() {
        return universityAddress;
    }

    public void setUniversityAddress(String universityAddress) {
        this.universityAddress = universityAddress;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityIdx=" + universityIdx +
                ", universityName='" + universityName + '\'' +
                ", universityPhone='" + universityPhone + '\'' +
                ", universityAddress='" + universityAddress + '\'' +
                '}';
    }
}
