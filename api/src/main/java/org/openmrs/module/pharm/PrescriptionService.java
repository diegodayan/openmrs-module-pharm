package org.openmrs.module.pharm;

import java.util.List;

import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.PrescriptionServiceImpl;

public interface PrescriptionService extends OpenmrsService {

    public Prescription savePrescription(Prescription prescription);

    public Prescription getPrescription(Integer id);

    public List<Prescription> getPrescriptionsByPatient(Patient patient);
}
