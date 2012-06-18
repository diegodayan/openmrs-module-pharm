package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Appointment;
import org.openmrs.module.pharm.AppointmentService;

/**
 * This is the DAO interface. This is never used by the developer, but instead
 * the {@link NoteService} calls it (and developers call the NoteService)
 */
public interface AppointmentDAO {

    Appointment getAppointment(Integer id);

    Appointment saveAppointment(Appointment appointment);
}
