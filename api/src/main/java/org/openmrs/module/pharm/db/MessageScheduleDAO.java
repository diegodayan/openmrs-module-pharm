package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.MessageSchedule;
import org.openmrs.module.pharm.MessageScheduleService;

public interface MessageScheduleDAO {

    MessageSchedule getMessageSchedule(Integer id);

    MessageSchedule saveMessageSchedule(MessageSchedule mid);
}
