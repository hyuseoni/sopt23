package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {

    private int universityIdx;
    private String universityName;
    private String universityPhone;
    private String universityAddress;

    public UniversityBuilder setUniversityIdx(final int universityIdx) {
        this.universityIdx = universityIdx;
        return this;
    }

    public UniversityBuilder setUniversityName(final String universityName) {
        this.universityName = universityName;
        return this;
    }

    public UniversityBuilder setUniversityPhone(final String universityPhone) {
        this.universityPhone = universityPhone;
        return this;
    }

    public UniversityBuilder setUniversityAddress(final String universityAddress) {
        this.universityAddress = universityAddress;
        return this;
    }

    public University build(){
        return new University(this.universityIdx, this.universityName, this.universityPhone, this.universityAddress);
    }
}
