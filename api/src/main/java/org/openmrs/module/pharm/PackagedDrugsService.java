package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.PackagedDrugsServiceImpl;

public interface PackagedDrugsService extends OpenmrsService {

    public PackagedDrugs savePackagedDrugs(PackagedDrugs pdid);

    public PackagedDrugs getPackagedDrugs(Integer id);
}
