package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.AttributeType;
import org.openmrs.module.pharm.AttributeTypeService;
import org.openmrs.module.pharm.db.AttributeTypeDAO;
import org.springframework.transaction.annotation.Transactional;

public class AttributeTypeServiceImpl extends BaseOpenmrsService implements AttributeTypeService {

    private AttributeTypeDAO dao;

    public void setDao(AttributeTypeDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public AttributeType getAttributeType(Integer id) {
        return dao.getAttributeType(id);
    }

    @Transactional
    public AttributeType saveAttributeType(AttributeType attrType) {
        return dao.saveAttributeType(attrType);
    }
}
