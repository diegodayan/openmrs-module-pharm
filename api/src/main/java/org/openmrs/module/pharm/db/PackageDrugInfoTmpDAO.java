package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.PackageDrugInfoTmp;
import org.openmrs.module.pharm.PackageDrugInfoTmpService;

public interface PackageDrugInfoTmpDAO {

    PackageDrugInfoTmp getPackageDrugInfoTmp(Integer id);

    PackageDrugInfoTmp savePackageDrugInfoTmp(PackageDrugInfoTmp pditid);
}
