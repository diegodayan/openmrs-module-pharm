package org.openmrs.module.pharm.db.hibernate;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.openmrs.Patient;
import org.openmrs.module.pharm.CampaignParticipant;
import org.openmrs.module.pharm.CampaignParticipantService;
import org.openmrs.module.pharm.db.CampaignParticipantDAO;

public class HibernateCampaignParticipantDAO implements CampaignParticipantDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public CampaignParticipant getCampaignParticipant(Integer id) {
        return (CampaignParticipant) sessionFactory.getCurrentSession().get(CampaignParticipant.class, id);
    }

    public CampaignParticipant saveCampaignParticipant(CampaignParticipant cp) {
        sessionFactory.getCurrentSession().saveOrUpdate(cp);
        return cp;
    }
}
