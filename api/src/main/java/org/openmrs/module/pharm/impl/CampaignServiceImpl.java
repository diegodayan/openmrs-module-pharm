package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Campaign;
import org.openmrs.module.pharm.CampaignService;
import org.openmrs.module.pharm.db.CampaignDAO;
import org.springframework.transaction.annotation.Transactional;

public class CampaignServiceImpl extends BaseOpenmrsService implements CampaignService {

    private CampaignDAO dao;

    public void setDao(CampaignDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Campaign getCampaign(Integer id) {
        return dao.getCampaign(id);
    }

    @Transactional
    public Campaign saveCampaign(Campaign campaign) {
        return dao.saveCampaign(campaign);
    }
}
