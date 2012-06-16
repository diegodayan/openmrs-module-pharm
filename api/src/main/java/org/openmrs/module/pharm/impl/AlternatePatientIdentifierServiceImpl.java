package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.AlternatePatientIdentifier;
import org.openmrs.module.pharm.AlternatePatientIdentifierService;
import org.openmrs.module.pharm.db.AlternatePatientIdentifierDAO;
import org.springframework.transaction.annotation.Transactional;

public class AlternatePatientIdentifierServiceImpl extends BaseOpenmrsService implements AlternatePatientIdentifierService {

    private AlternatePatientIdentifierDAO dao;

    public void setDao(AlternatePatientIdentifierDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public AlternatePatientIdentifier getAlternatePatientIdentifier(Integer id) {
        return dao.getAlternatePatientIdentifier(id);
    }

    @Transactional
    public AlternatePatientIdentifier saveAlternatePatientIdentifier(AlternatePatientIdentifier apid) {
        return dao.saveAlternatePatientIdentifier(apid);
    }
}
