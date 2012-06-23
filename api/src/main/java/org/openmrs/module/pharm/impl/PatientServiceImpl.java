package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Patient;
import org.openmrs.module.pharm.PatientService;
import org.openmrs.module.pharm.db.PatientDAO;
import org.springframework.transaction.annotation.Transactional;

public class PatientServiceImpl extends BaseOpenmrsService implements PatientService {

    private PatientDAO dao;

    public void setDao(PatientDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Patient getPatient(Integer id) {
        return dao.getPatient(id);
    }

    @Transactional
    public Patient savePatient(Patient patid) {
        return dao.savePatient(patid);
    }
}
