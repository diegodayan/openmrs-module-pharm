package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Package;
import org.openmrs.module.pharm.PackageService;
import org.openmrs.module.pharm.db.PackageDAO;
import org.springframework.transaction.annotation.Transactional;

public class PackageServiceImpl extends BaseOpenmrsService implements PackageService {

    private PackageDAO dao;

    public void setDao(PackageDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Package getPackage(Integer id) {
        return dao.getPackage(id);
    }

    @Transactional
    public Package savePackage(Package pid) {
        return dao.savePackage(pid);
    }
}
