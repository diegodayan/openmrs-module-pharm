package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Drug;
import org.openmrs.module.pharm.DrugService;
import org.openmrs.module.pharm.db.DrugDAO;
import org.springframework.transaction.annotation.Transactional;

public class DrugServiceImpl extends BaseOpenmrsService implements DrugService {

    private DrugDAO dao;

    public void setDao(DrugDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Drug getDrug(Integer id) {
        return dao.getDrug(id);
    }

    @Transactional
    public Drug saveDrug(Drug did) {
        return dao.saveDrug(did);
    }
}
