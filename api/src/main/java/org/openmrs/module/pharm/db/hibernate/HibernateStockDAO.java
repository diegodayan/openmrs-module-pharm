/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db.hibernate;

import org.hibernate.SessionFactory;
import org.openmrs.module.pharm.Stock;
import org.openmrs.module.pharm.db.StockDAO;

/**
 *
 * @author Yan
 */
public class HibernateStockDAO implements StockDAO{
    
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

    public Stock getStock(Integer id) {
        return (Stock) sessionFactory.getCurrentSession().get(Stock.class, id);
    }

    public Stock saveStock(Stock stock) {
        sessionFactory.getCurrentSession().saveOrUpdate(stock);
        return stock;
    }
    
}
