package org.openmrs.module.pharm;

import java.util.List;

import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.ClinicServiceImpl;

public interface ClinicService extends OpenmrsService {

    public Clinic saveClinic(Clinic clinic);

    public Clinic getClinic(Integer id);
}
