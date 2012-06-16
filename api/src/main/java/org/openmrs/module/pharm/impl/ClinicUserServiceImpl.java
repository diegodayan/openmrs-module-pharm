package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.ClinicUser;
import org.openmrs.module.pharm.ClinicUserService;
import org.openmrs.module.pharm.db.ClinicUserDAO;
import org.springframework.transaction.annotation.Transactional;

public class ClinicUserServiceImpl extends BaseOpenmrsService implements ClinicUserService {

    private ClinicUserDAO dao;

    public void setDao(ClinicUserDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public ClinicUser getClinicUser(Integer id) {
        return dao.getClinicUser(id);
    }

    @Transactional
    public ClinicUser saveClinicUser(ClinicUser clinicUser) {
        return dao.saveClinicUser(clinicUser);
    }
}
