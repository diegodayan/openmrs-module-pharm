package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.NationalClinics;
import org.openmrs.module.pharm.NationalClinicsService;
import org.openmrs.module.pharm.db.NationalClinicsDAO;
import org.springframework.transaction.annotation.Transactional;

public class NationalClinicsServiceImpl extends BaseOpenmrsService implements NationalClinicsService {

    private NationalClinicsDAO dao;

    public void setDao(NationalClinicsDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public NationalClinics getNationalClinics(Integer id) {
        return dao.getNationalClinics(id);
    }

    @Transactional
    public NationalClinics saveNationalClinics(NationalClinics nid) {
        return dao.saveNationalClinics(nid);
    }
}
