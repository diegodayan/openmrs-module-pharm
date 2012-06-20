package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.PatientStatistic;
import org.openmrs.module.pharm.PatientStatisticService;
import org.openmrs.module.pharm.db.PatientStatisticDAO;
import org.springframework.transaction.annotation.Transactional;

public class PatientStatisticServiceImpl extends BaseOpenmrsService implements PatientStatisticService {

    private PatientStatisticDAO dao;

    public void setDao(PatientStatisticDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public PatientStatistic getPatientStatistic(Integer id) {
        return dao.getPatientStatistic(id);
    }

    @Transactional
    public PatientStatistic savePatientStatistic(PatientStatistic psid) {
        return dao.savePatientStatistic(psid);
    }
}
