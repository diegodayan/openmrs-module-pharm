package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Alert;
import org.openmrs.module.pharm.AlertService;
import org.openmrs.module.pharm.db.AlertDAO;

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
public class HibernateAlertDAO implements AlertDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Alert getAlert(Integer id) {
        return (Alert) sessionFactory.getCurrentSession().get(Alert.class, id);
    }

    public Alert saveAlert(Alert alert) {
        sessionFactory.getCurrentSession().saveOrUpdate(alert);
        return alert;
    }
}
