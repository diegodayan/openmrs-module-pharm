package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Episode;
import org.openmrs.module.pharm.EpisodeService;
import org.openmrs.module.pharm.db.EpisodeDAO;
import org.springframework.transaction.annotation.Transactional;

public class EpisodeServiceImpl extends BaseOpenmrsService implements EpisodeService {

    private EpisodeDAO dao;

    public void setDao(EpisodeDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Episode getEpisode(Integer id) {
        return dao.getEpisode(id);
    }

    @Transactional
    public Episode saveEpisode(Episode eid) {
        return dao.saveEpisode(eid);
    }
}
