package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.AtcCode;
import org.openmrs.module.pharm.AtcCodeService;
import org.openmrs.module.pharm.db.AtcCodeDAO;
import org.springframework.transaction.annotation.Transactional;

public class AtcCodeServiceImpl extends BaseOpenmrsService implements AtcCodeService {

    private AtcCodeDAO dao;

    public void setDao(AtcCodeDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public AtcCode getAtcCode(Integer id) {
        return dao.getAtcCode(id);
    }

    @Transactional
    public AtcCode saveAtcCode(AtcCode atcCode) {
        return dao.saveAtcCode(atcCode);
    }
}
