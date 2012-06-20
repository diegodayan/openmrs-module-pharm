package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.IdentifierType;
import org.openmrs.module.pharm.IdentifierTypeService;
import org.openmrs.module.pharm.db.IdentifierTypeDAO;
import org.springframework.transaction.annotation.Transactional;

public class IdentifierTypeServiceImpl extends BaseOpenmrsService implements IdentifierTypeService {

    private IdentifierTypeDAO dao;

    public void setDao(IdentifierTypeDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public IdentifierType getIdentifierType(Integer id) {
        return dao.getIdentifierType(id);
    }

    @Transactional
    public IdentifierType saveIdentifierType(IdentifierType itid) {
        return dao.saveIdentifierType(itid);
    }
}
