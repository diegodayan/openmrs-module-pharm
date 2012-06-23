package org.openmrs.module.pharm.db;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.module.pharm.Prescription;
import org.openmrs.module.pharm.PrescriptionService;

public interface PrescriptionDAO {

    Prescription getPrescription(Integer id);

    List<Prescription> getPrescriptions(Patient patient);

    Prescription savePrescription(Prescription prescription);
}
