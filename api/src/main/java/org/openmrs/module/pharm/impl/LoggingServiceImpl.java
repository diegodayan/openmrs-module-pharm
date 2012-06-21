package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Logging;
import org.openmrs.module.pharm.LoggingService;
import org.openmrs.module.pharm.db.LoggingDAO;
import org.springframework.transaction.annotation.Transactional;

public class LoggingServiceImpl extends BaseOpenmrsService implements LoggingService {

    private LoggingDAO dao;

    public void setDao(LoggingDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Logging getLogging(Integer id) {
        return dao.getLogging(id);
    }

    @Transactional
    public Logging saveLogging(Logging lid) {
        return dao.saveLogging(lid);
    }
}
