package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Prescription;
import org.openmrs.module.pharm.PrescriptionService;
import org.openmrs.module.pharm.db.PrescriptionDAO;

public class HibernatePrescriptionDAO implements PrescriptionDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Prescription getPrescription(Integer id) {
        return (Prescription) sessionFactory.getCurrentSession().get(Prescription.class, id);
    }

    public List<Prescription> getPrescriptions(Patient patient) {
        Criteria crit = sessionFactory.getCurrentSession().createCriteria(
                Prescription.class);
        crit.add(Restrictions.eq("patient", patient));
        return crit.list();
    }

    public Prescription savePrescription(Prescription prescription) {
        sessionFactory.getCurrentSession().saveOrUpdate(prescription);
        return prescription;
    }
}
