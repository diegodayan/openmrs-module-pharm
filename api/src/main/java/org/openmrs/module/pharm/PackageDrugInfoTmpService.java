package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.PackageDrugInfoTmpServiceImpl;

public interface PackageDrugInfoTmpService extends OpenmrsService {

    public PackageDrugInfoTmp savePackageDrugInfoTmp(PackageDrugInfoTmp pditid);

    public PackageDrugInfoTmp getPackageDrugInfoTmp(Integer id);
}
