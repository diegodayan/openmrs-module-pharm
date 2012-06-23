package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.AccumulatedDrugServiceImpl;

public interface AccumulatedDrugService extends OpenmrsService {

    public AccumulatedDrug saveAccumulatedDrug(AccumulatedDrug ad);

    public AccumulatedDrug getAccumulatedDrug(Integer id);
}
