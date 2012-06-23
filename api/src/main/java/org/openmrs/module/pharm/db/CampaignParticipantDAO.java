package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.CampaignParticipant;
import org.openmrs.module.pharm.CampaignParticipantService;

public interface CampaignParticipantDAO {

    CampaignParticipant getCampaignParticipant(Integer id);

    CampaignParticipant saveCampaignParticipant(CampaignParticipant cp);
}
