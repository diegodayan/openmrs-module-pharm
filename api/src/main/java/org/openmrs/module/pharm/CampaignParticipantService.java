package org.openmrs.module.pharm;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.CampaignParticipantServiceImpl;

public interface CampaignParticipantService extends OpenmrsService {

    public CampaignParticipant saveCampaignParticipant(CampaignParticipant campaignParticipant);

    public CampaignParticipant getCampaignParticipant(Integer id);
}
