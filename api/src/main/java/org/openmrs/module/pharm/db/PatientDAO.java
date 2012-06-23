package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Patient;
import org.openmrs.module.pharm.PatientService;

public interface PatientDAO {

    Patient getPatient(Integer id);

    Patient savePatient(Patient patid);
}
