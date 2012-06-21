package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.PatientServiceImpl;

public interface PatientService extends OpenmrsService {

    public Patient savePatient(Patient patid);

    public Patient getPatient(Integer id);
}
