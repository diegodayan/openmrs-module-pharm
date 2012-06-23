package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.PackagedDrugs;
import org.openmrs.module.pharm.PackagedDrugsService;

public interface PackagedDrugsDAO {

    PackagedDrugs getPackagedDrugs(Integer id);

    PackagedDrugs savePackagedDrugs(PackagedDrugs pdid);
}
