package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Drug;
import org.openmrs.module.pharm.DrugService;

public interface DrugDAO {

    Drug getDrug(Integer id);

    Drug saveDrug(Drug did);
}
