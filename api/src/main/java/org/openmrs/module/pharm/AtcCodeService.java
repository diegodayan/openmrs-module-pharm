package org.openmrs.module.pharm;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.AtcCodeServiceImpl;

public interface AtcCodeService extends OpenmrsService {

    public AtcCode saveAtcCode(AtcCode atcCode);

    public AtcCode getAtcCode(Integer id);
}
