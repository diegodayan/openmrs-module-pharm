package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Campaign;
import org.openmrs.module.pharm.CampaignService;
import org.openmrs.module.pharm.db.CampaignDAO;

public class HibernateCampaignDAO implements CampaignDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Campaign getCampaign(Integer id) {
        return (Campaign) sessionFactory.getCurrentSession().get(Campaign.class, id);
    }

    public Campaign saveCampaign(Campaign campaign) {
        sessionFactory.getCurrentSession().saveOrUpdate(campaign);
        return campaign;
    }
}
