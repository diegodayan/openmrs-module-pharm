package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Doctor;
import org.openmrs.module.pharm.DoctorService;
import org.openmrs.module.pharm.db.DoctorDAO;
import org.springframework.transaction.annotation.Transactional;

public class DoctorServiceImpl extends BaseOpenmrsService implements DoctorService {

    private DoctorDAO dao;

    public void setDao(DoctorDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Doctor getDoctor(Integer id) {
        return dao.getDoctor(id);
    }

    @Transactional
    public Doctor saveDoctor(Doctor docid) {
        return dao.saveDoctor(docid);
    }
}
