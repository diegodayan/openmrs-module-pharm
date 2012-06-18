package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Prescription;
import org.openmrs.module.pharm.PrescriptionService;
import org.openmrs.module.pharm.db.PrescriptionDAO;
import org.springframework.transaction.annotation.Transactional;

public class PrescriptionServiceImpl extends BaseOpenmrsService implements PrescriptionService {

    private PrescriptionDAO dao;

    public void setDao(PrescriptionDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public Prescription getPrescription(Integer id) {
        return dao.getPrescription(id);
    }

    @Transactional(readOnly = true)
    public List<Prescription> getPrescriptionsByPatient(Patient patient) {
        return dao.getPrescriptions(patient);
    }

    @Transactional
    public Prescription savePrescription(Prescription prescription) {
        return dao.savePrescription(prescription);
    }
}
