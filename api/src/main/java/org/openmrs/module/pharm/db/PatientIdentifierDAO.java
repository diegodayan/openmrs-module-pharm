package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.PatientIdentifier;
import org.openmrs.module.pharm.PatientIdentifierService;

public interface PatientIdentifierDAO {

    PatientIdentifier getPatientIdentifier(Integer id);

    PatientIdentifier savePatientIdentifier(PatientIdentifier piid);
}
