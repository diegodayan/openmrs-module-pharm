package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.AlternatePatientIdentifier;
import org.openmrs.module.pharm.AlternatePatientIdentifierService;
import org.openmrs.module.pharm.db.AlternatePatientIdentifierDAO;

public class HibernateAlternatePatientIdentifierDAO implements AlternatePatientIdentifierDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public AlternatePatientIdentifier getAlternatePatientIdentifier(Integer id) {
        return (AlternatePatientIdentifier) sessionFactory.getCurrentSession().get(AlternatePatientIdentifier.class, id);
    }

    public AlternatePatientIdentifier saveAlternatePatientIdentifier(AlternatePatientIdentifier apid) {
        sessionFactory.getCurrentSession().saveOrUpdate(apid);
        return apid;
    }
}
