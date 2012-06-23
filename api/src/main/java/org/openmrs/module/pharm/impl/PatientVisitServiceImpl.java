package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.PatientVisit;
import org.openmrs.module.pharm.PatientVisitService;
import org.openmrs.module.pharm.db.PatientVisitDAO;
import org.springframework.transaction.annotation.Transactional;

public class PatientVisitServiceImpl extends BaseOpenmrsService implements PatientVisitService {

    private PatientVisitDAO dao;

    public void setDao(PatientVisitDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public PatientVisit getPatientVisit(Integer id) {
        return dao.getPatientVisit(id);
    }

    @Transactional
    public PatientVisit savePatientVisit(PatientVisit pvid) {
        return dao.savePatientVisit(pvid);
    }
}
