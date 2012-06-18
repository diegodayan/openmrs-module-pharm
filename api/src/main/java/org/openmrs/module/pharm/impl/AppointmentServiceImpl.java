package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Appointment;
import org.openmrs.module.pharm.AppointmentService;
import org.openmrs.module.pharm.db.AppointmentDAO;
import org.springframework.transaction.annotation.Transactional;

public class AppointmentServiceImpl extends BaseOpenmrsService implements AppointmentService {

    private AppointmentDAO dao;

    public void setDao(AppointmentDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Appointment getAppointment(Integer id) {
        return dao.getAppointment(id);
    }

    @Transactional
    public Appointment saveAppointment(Appointment appointment) {
        return dao.saveAppointment(appointment);
    }
}
