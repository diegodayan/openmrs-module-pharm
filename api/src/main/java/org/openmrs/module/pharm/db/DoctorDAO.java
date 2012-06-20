package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Doctor;
import org.openmrs.module.pharm.DoctorService;

public interface DoctorDAO {

    Doctor getDoctor(Integer id);

    Doctor saveDoctor(Doctor docid);
}
