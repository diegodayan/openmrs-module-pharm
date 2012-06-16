package org.openmrs.module.pharm;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.ClinicUserServiceImpl;

public interface ClinicUserService extends OpenmrsService {

    public ClinicUser saveClinicUser(ClinicUser clinicUser);

    public ClinicUser getClinicUser(Integer id);
}
