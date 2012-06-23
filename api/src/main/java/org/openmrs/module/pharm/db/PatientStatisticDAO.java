package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.PatientStatistic;
import org.openmrs.module.pharm.PatientStatisticService;

public interface PatientStatisticDAO {

    PatientStatistic getPatientStatistic(Integer id);

    PatientStatistic savePatientStatistic(PatientStatistic psid);
}
