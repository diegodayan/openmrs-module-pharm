package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.PatientStatTypesServiceImpl;

public interface PatientStatTypesService extends OpenmrsService {

    public PatientStatTypes savePatientStatTypes(PatientStatTypes pstid);

    public PatientStatTypes getPatientStatTypes(Integer id);
}
