package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Logging;
import org.openmrs.module.pharm.LoggingService;

public interface LoggingDAO {

    Logging getLogging(Integer id);

    Logging saveLogging(Logging lid);
}
