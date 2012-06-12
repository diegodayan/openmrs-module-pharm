package org.openmrs.module.pharm.web.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.PharmDrug;
import org.openmrs.module.pharm.PharmDrugService;

public class DWRMyPharmDrugsService {

    private Collection<Patient> patients;
    private Collection<PharmDrug> pharmDrugs;

    /**
     * Get ALL the PharmDrugs of a given patient
     *
     * @param patientName
     * @return
     */
    public Collection<PharmDrug> getPharmDrugsForPatient(String patientName) {
        System.out.println("My DWR called - drugs for: " + patientName);
        ArrayList<PharmDrug> drugs = new ArrayList<PharmDrug>();
        ArrayList<String> texts = new ArrayList<String>();
        patients = Context.getPatientService().getAllPatients();
        PharmDrugService drugService = Context.getService(PharmDrugService.class);
        for (Patient p : patients) {
            drugs.addAll(drugService.getPharmDrugsByPatient(p));
        }
        return drugs;
    }

    /**
     * Delete a PharmDrug given its ID
     *
     * @param pharmDrugId
     * @return
     */
    public PharmDrug deletePharmDrugById(Integer pharmDrugId) {
        // 1) we need the service to retrieve/store data
        PharmDrugService pharmDrugService = Context.getService(PharmDrugService.class);
        // 2) retrieve the PharmDrug
        PharmDrug drug = pharmDrugService.getPharmDrug(pharmDrugId);
        // 3) delete the PharmDrug
        pharmDrugService.deletePharmDrug(drug);
        // 4) return the just deleted drug (note that it's no longer in the DB)
        return drug;
    }

    public PharmDrug createPharmDrugForPatient(String patientId, String title, String text) {
        // get the patient
        Patient patient = Context.getPatientService().getPatient(Integer.parseInt(patientId));

        // create the pharmDrug
        PharmDrug pharmDrug = new PharmDrug();
        pharmDrug.setTitle(title);
        pharmDrug.setText(text);
        pharmDrug.setUuid(UUID.randomUUID().toString());
        pharmDrug.setPatient(patient);
        // it is not necessary to set the following values, they are set automtically
        // pharmDrug.setCreator(Context.getUserContext().getAuthenticatedUser()); 
        // pharmDrug.setDateCreated(new Date());

        // save it
        Context.getService(PharmDrugService.class).savePharmDrug(pharmDrug);
        return pharmDrug;
    }
}
