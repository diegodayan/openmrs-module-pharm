package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.PatientAttribute;
import org.openmrs.module.pharm.PatientAttributeService;
import org.openmrs.module.pharm.db.PatientAttributeDAO;
import org.springframework.transaction.annotation.Transactional;

public class PatientAttributeServiceImpl extends BaseOpenmrsService implements PatientAttributeService {

    private PatientAttributeDAO dao;

    public void setDao(PatientAttributeDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public PatientAttribute getPatientAttribute(Integer id) {
        return dao.getPatientAttribute(id);
    }

    @Transactional
    public PatientAttribute savePatientAttribute(PatientAttribute paid) {
        return dao.savePatientAttribute(paid);
    }
}
