package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.DrugServiceImpl;

public interface DrugService extends OpenmrsService {

    public Drug saveDrug(Drug did);

    public Drug getDrug(Integer id);
}
