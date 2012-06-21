package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.PatientVisit;
import org.openmrs.module.pharm.PatientVisitService;

public interface PatientVisitDAO {

    PatientVisit getPatientVisit(Integer id);

    PatientVisit savePatientVisit(PatientVisit pvid);
}
