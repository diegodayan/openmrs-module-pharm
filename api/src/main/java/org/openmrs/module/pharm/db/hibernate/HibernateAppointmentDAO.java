package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Appointment;
import org.openmrs.module.pharm.AppointmentService;
import org.openmrs.module.pharm.db.AppointmentDAO;

/**
 * This class should not be called directly. Instead, the {@link NoteService}
 * should be using this. A developer should do:
 * <code>
 *
 *   Context.getService(NoteService.class).saveNote(note)...
 *
 * </code>
 *
 */
public class HibernateAppointmentDAO implements AppointmentDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Appointment getAppointment(Integer id) {
        return (Appointment) sessionFactory.getCurrentSession().get(Appointment.class, id);
    }

    public Appointment saveAppointment(Appointment appointment) {
        sessionFactory.getCurrentSession().saveOrUpdate(appointment);
        return appointment;
    }
}
