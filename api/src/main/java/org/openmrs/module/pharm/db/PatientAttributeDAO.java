package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.PatientAttribute;
import org.openmrs.module.pharm.PatientAttributeService;

public interface PatientAttributeDAO {

    PatientAttribute getPatientAttribute(Integer id);

    PatientAttribute savePatientAttribute(PatientAttribute paid);
}
