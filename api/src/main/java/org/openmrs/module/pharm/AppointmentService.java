package org.openmrs.module.pharm;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.AppointmentServiceImpl;

public interface AppointmentService extends OpenmrsService {

    public Appointment saveAppointment(Appointment appointment);

    public Appointment getAppointment(Integer id);
}
