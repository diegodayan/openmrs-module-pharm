package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Clinic;
import org.openmrs.module.pharm.ClinicService;

/**
 * This is the DAO interface. This is never used by the developer, but instead
 * the {@link NoteService} calls it (and developers call the NoteService)
 */
public interface ClinicDAO {

    Clinic getClinic(Integer id);

    Clinic saveClinic(Clinic clinic);
}
