package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.PatientStatTypes;
import org.openmrs.module.pharm.PatientStatTypesService;
import org.openmrs.module.pharm.db.PatientStatTypesDAO;
import org.springframework.transaction.annotation.Transactional;

public class PatientStatTypesServiceImpl extends BaseOpenmrsService implements PatientStatTypesService {

    private PatientStatTypesDAO dao;

    public void setDao(PatientStatTypesDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public PatientStatTypes getPatientStatTypes(Integer id) {
        return dao.getPatientStatTypes(id);
    }

    @Transactional
    public PatientStatTypes savePatientStatTypes(PatientStatTypes pstid) {
        return dao.savePatientStatTypes(pstid);
    }
}
