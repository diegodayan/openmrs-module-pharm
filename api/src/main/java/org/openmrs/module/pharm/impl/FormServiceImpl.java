package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Form;
import org.openmrs.module.pharm.FormService;
import org.openmrs.module.pharm.db.FormDAO;
import org.springframework.transaction.annotation.Transactional;

public class FormServiceImpl extends BaseOpenmrsService implements FormService {

    private FormDAO dao;

    public void setDao(FormDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Form getForm(Integer id) {
        return dao.getForm(id);
    }

    @Transactional
    public Form saveForm(Form fid) {
        return dao.saveForm(fid);
    }
}
