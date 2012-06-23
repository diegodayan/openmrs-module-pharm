package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.NationalClinics;
import org.openmrs.module.pharm.NationalClinicsService;

public interface NationalClinicsDAO {

    NationalClinics getNationalClinics(Integer id);

    NationalClinics saveNationalClinics(NationalClinics nid);
}
