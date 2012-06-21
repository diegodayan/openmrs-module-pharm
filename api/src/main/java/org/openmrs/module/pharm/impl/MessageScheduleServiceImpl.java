package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.MessageSchedule;
import org.openmrs.module.pharm.MessageScheduleService;
import org.openmrs.module.pharm.db.MessageScheduleDAO;
import org.springframework.transaction.annotation.Transactional;

public class MessageScheduleServiceImpl extends BaseOpenmrsService implements MessageScheduleService {

    private MessageScheduleDAO dao;

    public void setDao(MessageScheduleDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public MessageSchedule getMessageSchedule(Integer id) {
        return dao.getMessageSchedule(id);
    }

    @Transactional
    public MessageSchedule saveMessageSchedule(MessageSchedule mid) {
        return dao.saveMessageSchedule(mid);
    }
}
