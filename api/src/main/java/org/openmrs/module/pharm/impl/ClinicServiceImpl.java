package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Clinic;
import org.openmrs.module.pharm.ClinicService;
import org.openmrs.module.pharm.db.ClinicDAO;
import org.springframework.transaction.annotation.Transactional;

public class ClinicServiceImpl extends BaseOpenmrsService implements ClinicService {

    private ClinicDAO dao;

    public void setDao(ClinicDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Clinic getClinic(Integer id) {
        return dao.getClinic(id);
    }

    @Transactional
    public Clinic saveClinic(Clinic clinic) {
        return dao.saveClinic(clinic);
    }
}
