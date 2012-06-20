package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.PatientIdentifierServiceImpl;

public interface PatientIdentifierService extends OpenmrsService {

    public PatientIdentifier savePatientIdentifier(PatientIdentifier piid);

    public PatientIdentifier getPatientIdentifier(Integer id);
}
