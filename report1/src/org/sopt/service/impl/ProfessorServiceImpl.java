package org.sopt.service.impl;

import org.sopt.model.Professor;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.service.ProfessorService;

public class ProfessorServiceImpl implements ProfessorService {

    private ProfessorBuilder professorBuilder = new ProfessorBuilder();

    @Override
    public Professor getByProfessorIdx(int getByProfessorIdx) {
        return professorBuilder.setProfessorIdx(getByProfessorIdx).build();
    }
}
