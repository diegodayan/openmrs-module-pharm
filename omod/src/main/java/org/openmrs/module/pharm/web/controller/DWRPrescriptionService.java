package org.openmrs.module.pharm.web.controller;

import java.util.ArrayList;
import java.util.Collection;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.Prescription;
import org.openmrs.module.pharm.PrescriptionService;

public class DWRPrescriptionService {

    private Collection<Patient> patients;
    private Collection<Prescription> prescriptions;

    public Collection<Prescription> getPrescriptionsForPatient(String patientName) {
        System.out.print(DWRPrescriptionService.class.getName() + " called");
        System.out.println(" Loading prescriptions for: " + patientName);
        ArrayList<Prescription> ps = new ArrayList<Prescription>();
        ArrayList<String> texts = new ArrayList<String>();
        patients = Context.getPatientService().getAllPatients();
        PrescriptionService pService = Context.getService(PrescriptionService.class);
        for (Patient p : patients) {
            ps.addAll(pService.getPrescriptionsByPatient(p));
        }
        return ps;
    }
}
