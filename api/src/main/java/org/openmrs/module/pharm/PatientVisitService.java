package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.PatientVisitServiceImpl;

public interface PatientVisitService extends OpenmrsService {

    public PatientVisit savePatientVisit(PatientVisit pvid);

    public PatientVisit getPatientVisit(Integer id);
}
