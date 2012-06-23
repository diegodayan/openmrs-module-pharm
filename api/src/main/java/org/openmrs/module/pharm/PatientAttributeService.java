package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.PatientAttributeServiceImpl;

public interface PatientAttributeService extends OpenmrsService {

    public PatientAttribute savePatientAttribute(PatientAttribute paid);

    public PatientAttribute getPatientAttribute(Integer id);
}
