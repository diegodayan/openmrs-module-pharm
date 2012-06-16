package org.openmrs.module.pharm.db.hibernate;

import org.hibernate.SessionFactory;
import org.openmrs.module.pharm.AccumulatedDrug;
import org.openmrs.module.pharm.AccumulatedDrugService;
import org.openmrs.module.pharm.db.AccumulatedDrugDAO;

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
public class HibernateAccumulatedDrugDAO implements AccumulatedDrugDAO {

    private SessionFactory sessionFactory;

    /**
     * This is a Hibernate object. It gives us metadata about the currently
     * connected database, the current session, the current db user, etc. To
     * save and get objects, calls should go through
     * sessionFactory.getCurrentSession() <br/> <br/> This is called by Spring.
     * See the /metadata/moduleApplicationContext.xml for the "sessionFactory"
     * setting. See the applicationContext-service.xml file in CORE openmrs for
     * where the actual "sessionFactory" object is first defined.
     *
     * @param sessionFactory
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public AccumulatedDrug getAccumulatedDrug(Integer id) {
        return (AccumulatedDrug) sessionFactory.getCurrentSession().get(AccumulatedDrug.class, id);
    }

    public AccumulatedDrug saveAccumulatedDrug(AccumulatedDrug ad) {
        sessionFactory.getCurrentSession().saveOrUpdate(ad);
        return ad;
    }
}
