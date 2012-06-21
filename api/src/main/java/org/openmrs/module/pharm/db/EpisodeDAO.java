package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Episode;
import org.openmrs.module.pharm.EpisodeService;

public interface EpisodeDAO {

    Episode getEpisode(Integer id);

    Episode saveEpisode(Episode eid);
}
