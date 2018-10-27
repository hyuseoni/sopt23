package org.sopt.model.builder;

import org.sopt.model.Department;
import org.sopt.model.Professor;

public class ProfessorBuilder {

    private int professorIdx;
    private String professorName;
    private String professorMajor;
    private String professorPhone;
    private String professorSubject;

    public ProfessorBuilder setProfessorIdx(final int professorIdx){
        this.professorIdx = professorIdx;
        return this;
    }

    public ProfessorBuilder setProfessorName(final String professorName){
        this.professorName = professorName;
        return this;
    }

    public ProfessorBuilder professorMajor(final String professorMajor){
        this.professorMajor = professorMajor;
        return this;
    }

    public ProfessorBuilder setProfessorPhone(final String professorPhone){
        this.professorPhone = professorPhone;
        return this;
    }

    public ProfessorBuilder setProfessorSubject(final String professorSubject){
        this.professorSubject = professorSubject;
        return this;
    }

    public Professor build(){
        return new Professor(this.professorIdx, this.professorName, this.professorMajor, this.professorPhone, this.professorSubject);
    }
}
