package org.openmrs.module.pharm.db.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.AdherenceRecordTmp;
import org.openmrs.module.pharm.AdherenceRecordTmpService;
import org.openmrs.module.pharm.db.AdherenceRecordTmpDAO;

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
public class HibernateAdherenceRecordTmpDAO implements AdherenceRecordTmpDAO {

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

    public AdherenceRecordTmp getAdherenceRecordTmp(Integer id) {
        return (AdherenceRecordTmp) sessionFactory.getCurrentSession().get(AdherenceRecordTmp.class, id);
    }

    public AdherenceRecordTmp saveAdherenceRecordTmp(AdherenceRecordTmp art) {
        sessionFactory.getCurrentSession().saveOrUpdate(art);
        return art;
    }
}
