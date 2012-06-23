package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.LoggingServiceImpl;

public interface LoggingService extends OpenmrsService {

    public Logging saveLogging(Logging lid);

    public Logging getLogging(Integer id);
}
