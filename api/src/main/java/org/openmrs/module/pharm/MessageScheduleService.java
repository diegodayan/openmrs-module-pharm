package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.MessageScheduleServiceImpl;

public interface MessageScheduleService extends OpenmrsService {

    public MessageSchedule saveMessageSchedule(MessageSchedule mid);

    public MessageSchedule getMessageSchedule(Integer id);
}
