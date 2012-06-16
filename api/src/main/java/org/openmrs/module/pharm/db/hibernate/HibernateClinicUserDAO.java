package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.ClinicUser;
import org.openmrs.module.pharm.ClinicUserService;
import org.openmrs.module.pharm.db.ClinicUserDAO;

public class HibernateClinicUserDAO implements ClinicUserDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public ClinicUser getClinicUser(Integer id) {
        return (ClinicUser) sessionFactory.getCurrentSession().get(ClinicUser.class, id);
    }

    public ClinicUser saveClinicUser(ClinicUser clinicUser) {
        sessionFactory.getCurrentSession().saveOrUpdate(clinicUser);
        return clinicUser;
    }
}
