package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Clinic;
import org.openmrs.module.pharm.ClinicService;
import org.openmrs.module.pharm.db.ClinicDAO;

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
public class HibernateClinicDAO implements ClinicDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Clinic getClinic(Integer id) {
        return (Clinic) sessionFactory.getCurrentSession().get(Clinic.class, id);
    }

    public Clinic saveClinic(Clinic clinic) {
        sessionFactory.getCurrentSession().saveOrUpdate(clinic);
        return clinic;
    }
}
