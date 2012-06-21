package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.NationalClinicsServiceImpl;

public interface NationalClinicsService extends OpenmrsService {

    public NationalClinics saveNationalClinics(NationalClinics nid);

    public NationalClinics getNationalClinics(Integer id);
}
