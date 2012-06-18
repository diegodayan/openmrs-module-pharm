package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.ClinicUser;
import org.openmrs.module.pharm.ClinicUserService;

/**
 * This is the DAO interface. This is never used by the developer, but instead
 * the {@link NoteService} calls it (and developers call the NoteService)
 */
public interface ClinicUserDAO {

    ClinicUser getClinicUser(Integer id);

    ClinicUser saveClinicUser(ClinicUser clinicUser);
}
