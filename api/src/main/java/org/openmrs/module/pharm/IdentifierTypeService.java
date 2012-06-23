package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.IdentifierTypeServiceImpl;

public interface IdentifierTypeService extends OpenmrsService {

    public IdentifierType saveIdentifierType(IdentifierType itid);

    public IdentifierType getIdentifierType(Integer id);
}
