/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db.hibernate;

import org.hibernate.SessionFactory;
import org.openmrs.module.pharm.PrescribedDrugs;
import org.openmrs.module.pharm.db.PrescribedDrugsDAO;

/**
 *
 * @author Yan
 */
public class HibernatePrescribedDrugsDAO implements PrescribedDrugsDAO {
    
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

    public PrescribedDrugs getPrescribedDrugs(Integer id) {
        return (PrescribedDrugs) sessionFactory.getCurrentSession().get(PrescribedDrugs.class, id);
    }

    public PrescribedDrugs savePrescribedDrugs(PrescribedDrugs pd) {
        sessionFactory.getCurrentSession().saveOrUpdate(pd);
        return pd;
    }    
    
}
