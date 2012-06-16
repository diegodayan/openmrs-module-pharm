package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.AlternatePatientIdentifier;
import org.openmrs.module.pharm.AlternatePatientIdentifierService;

public interface AlternatePatientIdentifierDAO {

    AlternatePatientIdentifier getAlternatePatientIdentifier(Integer id);

    AlternatePatientIdentifier saveAlternatePatientIdentifier(AlternatePatientIdentifier apid);
}
