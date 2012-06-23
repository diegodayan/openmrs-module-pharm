package org.openmrs.module.pharm;

import java.util.List;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.AlertServiceImpl;

public interface AlertService extends OpenmrsService {

    public Alert saveAlert(Alert alert);

    public Alert getAlert(Integer id);
}
