package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.PackagedDrugs;
import org.openmrs.module.pharm.PackagedDrugsService;
import org.openmrs.module.pharm.db.PackagedDrugsDAO;
import org.springframework.transaction.annotation.Transactional;

public class PackagedDrugsServiceImpl extends BaseOpenmrsService implements PackagedDrugsService {

    private PackagedDrugsDAO dao;

    public void setDao(PackagedDrugsDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public PackagedDrugs getPackagedDrugs(Integer id) {
        return dao.getPackagedDrugs(id);
    }

    @Transactional
    public PackagedDrugs savePackagedDrugs(PackagedDrugs pdid) {
        return dao.savePackagedDrugs(pdid);
    }
}
