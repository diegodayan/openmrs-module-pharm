package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.AttributeType;
import org.openmrs.module.pharm.AttributeTypeService;

public interface AttributeTypeDAO {

    AttributeType getAttributeType(Integer id);

    AttributeType saveAttributeType(AttributeType attrType);
}
