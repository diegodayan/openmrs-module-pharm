package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.PatientStatisticServiceImpl;

public interface PatientStatisticService extends OpenmrsService {

    public PatientStatistic savePatientStatistic(PatientStatistic psid);

    public PatientStatistic getPatientStatistic(Integer id);
}
