package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.AtcCodeChemicalCompound;
import org.openmrs.module.pharm.AtcCodeChemicalCompoundService;
import org.openmrs.module.pharm.db.AtcCodeChemicalCompoundDAO;

public class HibernateAtcCodeChemicalCompoundDAO implements AtcCodeChemicalCompoundDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public AtcCodeChemicalCompound getAtcCodeChemicalCompound(Integer id) {
        return (AtcCodeChemicalCompound) sessionFactory.getCurrentSession().get(AtcCodeChemicalCompound.class, id);
    }

    public AtcCodeChemicalCompound saveAtcCodeChemicalCompound(AtcCodeChemicalCompound atcccc) {
        sessionFactory.getCurrentSession().saveOrUpdate(atcccc);
        return atcccc;
    }
}
