package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.PackageServiceImpl;

public interface PackageService extends OpenmrsService {

    public Package savePackage(Package pid);

    public Package getPackage(Integer id);
}
