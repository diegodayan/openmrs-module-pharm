package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.IdentifierType;
import org.openmrs.module.pharm.IdentifierTypeService;

public interface IdentifierTypeDAO {

    IdentifierType getIdentifierType(Integer id);

    IdentifierType saveIdentifierType(IdentifierType itid);
}
