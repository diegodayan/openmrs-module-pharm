package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Alert;
import org.openmrs.module.pharm.AlertService;
import org.openmrs.module.pharm.db.AlertDAO;
import org.springframework.transaction.annotation.Transactional;

public class AlertServiceImpl extends BaseOpenmrsService implements AlertService {

    private AlertDAO dao;

    public void setDao(AlertDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Alert getAlert(Integer id) {
        return dao.getAlert(id);
    }

    @Transactional
    public Alert saveAlert(Alert alert) {
        return dao.saveAlert(alert);
    }
}
