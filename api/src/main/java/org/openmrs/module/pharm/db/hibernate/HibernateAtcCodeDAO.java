package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.AtcCode;
import org.openmrs.module.pharm.AtcCodeService;
import org.openmrs.module.pharm.db.AtcCodeDAO;

public class HibernateAtcCodeDAO implements AtcCodeDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public AtcCode getAtcCode(Integer id) {
        return (AtcCode) sessionFactory.getCurrentSession().get(AtcCode.class, id);
    }

    public AtcCode saveAtcCode(AtcCode atcCode) {
        sessionFactory.getCurrentSession().saveOrUpdate(atcCode);
        return atcCode;
    }
}
