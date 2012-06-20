package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.PatientIdentifier;
import org.openmrs.module.pharm.PatientIdentifierService;
import org.openmrs.module.pharm.db.PatientIdentifierDAO;
import org.springframework.transaction.annotation.Transactional;

public class PatientIdentifierServiceImpl extends BaseOpenmrsService implements PatientIdentifierService {

    private PatientIdentifierDAO dao;

    public void setDao(PatientIdentifierDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public PatientIdentifier getPatientIdentifier(Integer id) {
        return dao.getPatientIdentifier(id);
    }

    @Transactional
    public PatientIdentifier savePatientIdentifier(PatientIdentifier piid) {
        return dao.savePatientIdentifier(piid);
    }
}
