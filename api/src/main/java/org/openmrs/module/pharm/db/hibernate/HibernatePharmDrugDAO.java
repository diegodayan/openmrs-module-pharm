package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.PharmDrug;
import org.openmrs.module.pharm.PharmDrugService;
import org.openmrs.module.pharm.db.PharmDrugDAO;

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
public class HibernatePharmDrugDAO implements PharmDrugDAO {

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

    public PharmDrug getPharmDrug(Integer id) {
        return (PharmDrug) sessionFactory.getCurrentSession().get(PharmDrug.class, id);
    }

    public PharmDrug getPharmDrugByUuid(String uuid) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(
                PharmDrug.class);
        crit.add(Restrictions.eq("uuid", uuid));
        return (PharmDrug) crit.uniqueResult();
    }

    public List<PharmDrug> getPharmDrugs(Patient patient) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(
                PharmDrug.class);
        crit.add(Restrictions.eq("patient", patient));
        return crit.list();
    }

    public PharmDrug savePharmDrug(PharmDrug pharmDrug) {
        sessionFactory.getCurrentSession().saveOrUpdate(pharmDrug);
        return pharmDrug;
    }

    public PharmDrug deletePharmDrug(PharmDrug pharmDrug) {
        sessionFactory.getCurrentSession().delete(pharmDrug);
        return pharmDrug;
    }
}
