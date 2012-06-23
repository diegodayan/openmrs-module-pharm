package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.ChemicalDrugStrength;
import org.openmrs.module.pharm.ChemicalDrugStrengthService;
import org.openmrs.module.pharm.db.ChemicalDrugStrengthDAO;

public class HibernateChemicalDrugStrengthDAO implements ChemicalDrugStrengthDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public ChemicalDrugStrength getChemicalDrugStrength(Integer id) {
        return (ChemicalDrugStrength) sessionFactory.getCurrentSession().get(ChemicalDrugStrength.class, id);
    }

    public ChemicalDrugStrength saveChemicalDrugStrength(ChemicalDrugStrength cds) {
        sessionFactory.getCurrentSession().saveOrUpdate(cds);
        return cds;
    }
}
