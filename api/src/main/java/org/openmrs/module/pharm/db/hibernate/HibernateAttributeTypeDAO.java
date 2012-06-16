package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.AttributeType;
import org.openmrs.module.pharm.AttributeTypeService;
import org.openmrs.module.pharm.db.AttributeTypeDAO;

public class HibernateAttributeTypeDAO implements AttributeTypeDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public AttributeType getAttributeType(Integer id) {
        return (AttributeType) sessionFactory.getCurrentSession().get(AttributeType.class, id);
    }

    public AttributeType saveAttributeType(AttributeType attrType) {
        sessionFactory.getCurrentSession().saveOrUpdate(attrType);
        return attrType;
    }
}
