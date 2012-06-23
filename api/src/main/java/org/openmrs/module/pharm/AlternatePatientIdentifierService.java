package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.AlternatePatientIdentifierServiceImpl;

public interface AlternatePatientIdentifierService extends OpenmrsService {

    public AlternatePatientIdentifier saveAlternatePatientIdentifier(AlternatePatientIdentifier apid);

    public AlternatePatientIdentifier getAlternatePatientIdentifier(Integer id);
}
