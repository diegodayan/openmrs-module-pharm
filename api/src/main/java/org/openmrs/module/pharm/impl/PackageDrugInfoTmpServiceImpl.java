package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.PackageDrugInfoTmp;
import org.openmrs.module.pharm.PackageDrugInfoTmpService;
import org.openmrs.module.pharm.db.PackageDrugInfoTmpDAO;
import org.springframework.transaction.annotation.Transactional;

public class PackageDrugInfoTmpServiceImpl extends BaseOpenmrsService implements PackageDrugInfoTmpService {

    private PackageDrugInfoTmpDAO dao;

    public void setDao(PackageDrugInfoTmpDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public PackageDrugInfoTmp getPackageDrugInfoTmp(Integer id) {
        return dao.getPackageDrugInfoTmp(id);
    }

    @Transactional
    public PackageDrugInfoTmp savePackageDrugInfoTmp(PackageDrugInfoTmp pditid) {
        return dao.savePackageDrugInfoTmp(pditid);
    }
}
