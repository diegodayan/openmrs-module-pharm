package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.AtcCode;
import org.openmrs.module.pharm.AtcCodeService;

public interface AtcCodeDAO {

    AtcCode getAtcCode(Integer id);

    AtcCode saveAtcCode(AtcCode atcCode);
}
