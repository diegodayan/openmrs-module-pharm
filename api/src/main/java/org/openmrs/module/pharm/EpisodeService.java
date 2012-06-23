package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.EpisodeServiceImpl;

public interface EpisodeService extends OpenmrsService {

    public Episode saveEpisode(Episode eid);

    public Episode getEpisode(Integer id);
}
