package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.PatientStatTypes;
import org.openmrs.module.pharm.PatientStatTypesService;

public interface PatientStatTypesDAO {

    PatientStatTypes getPatientStatTypes(Integer id);

    PatientStatTypes savePatientStatTypes(PatientStatTypes pstid);
}
