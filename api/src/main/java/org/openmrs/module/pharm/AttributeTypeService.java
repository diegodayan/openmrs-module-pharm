package org.openmrs.module.pharm;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.AttributeTypeServiceImpl;

public interface AttributeTypeService extends OpenmrsService {

    public AttributeType saveAttributeType(AttributeType attrType);

    public AttributeType getAttributeType(Integer id);
}
