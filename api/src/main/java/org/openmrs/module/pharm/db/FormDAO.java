package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Form;
import org.openmrs.module.pharm.FormService;

public interface FormDAO {

    Form getForm(Integer id);

    Form saveForm(Form fid);
}
