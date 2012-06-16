package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.CampaignParticipant;
import org.openmrs.module.pharm.CampaignParticipantService;
import org.openmrs.module.pharm.db.CampaignParticipantDAO;
import org.springframework.transaction.annotation.Transactional;

public class CampaignParticipantServiceImpl extends BaseOpenmrsService implements CampaignParticipantService {

    private CampaignParticipantDAO dao;

    public void setDao(CampaignParticipantDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public CampaignParticipant getCampaignParticipant(Integer id) {
        return dao.getCampaignParticipant(id);
    }

    @Transactional
    public CampaignParticipant saveCampaignParticipant(CampaignParticipant cp) {
        return dao.saveCampaignParticipant(cp);
    }
}
