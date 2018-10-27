package org.sopt.service.impl;

import org.sopt.model.University;
import org.sopt.model.builder.UniversityBuilder;
import org.sopt.service.UniversityService;

public class UniversityServiceImpl implements UniversityService {

    private UniversityBuilder universityBuilder = new UniversityBuilder();

    @Override
    public University getByUniversityIdx(int getByUniversityIdx) {
        return universityBuilder.setUniversityIdx(getByUniversityIdx).build();
    }

}
