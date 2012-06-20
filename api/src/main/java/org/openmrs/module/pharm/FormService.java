package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.FormServiceImpl;

public interface FormService extends OpenmrsService {

    public Form saveForm(Form fid);

    public Form getForm(Integer id);
}
