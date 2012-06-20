package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Package;
import org.openmrs.module.pharm.PackageService;

public interface PackageDAO {

    Package getPackage(Integer id);

    Package savePackage(Package pid);
}
