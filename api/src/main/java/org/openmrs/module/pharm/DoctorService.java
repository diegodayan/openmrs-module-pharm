package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.DoctorServiceImpl;

public interface DoctorService extends OpenmrsService {

    public Doctor saveDoctor(Doctor docid);

    public Doctor getDoctor(Integer id);
}
