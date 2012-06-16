package org.openmrs.module.pharm;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.CampaignServiceImpl;

public interface CampaignService extends OpenmrsService {

    public Campaign saveCampaign(Campaign campaign);

    public Campaign getCampaign(Integer id);
}
