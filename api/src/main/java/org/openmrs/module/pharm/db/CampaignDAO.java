package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Campaign;
import org.openmrs.module.pharm.CampaignService;

/**
 * This is the DAO interface. This is never used by the developer, but instead
 * the {@link NoteService} calls it (and developers call the NoteService)
 */
public interface CampaignDAO {

    Campaign getCampaign(Integer id);

    Campaign saveCampaign(Campaign campaign);
}
