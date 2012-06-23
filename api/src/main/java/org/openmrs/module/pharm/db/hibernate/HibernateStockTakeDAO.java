/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db.hibernate;

import org.hibernate.SessionFactory;
import org.openmrs.module.pharm.StockTake;
import org.openmrs.module.pharm.db.StockTakeDAO;

/**
 *
 * @author Yan
 */
public class HibernateStockTakeDAO implements StockTakeDAO{
    
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

    public StockTake getStockTake(Integer id) {
        return (StockTake) sessionFactory.getCurrentSession().get(StockTake.class, id);
    }

    public StockTake saveStockTake(StockTake st) {
        sessionFactory.getCurrentSession().saveOrUpdate(st);
        return st;
    }    
    
}
