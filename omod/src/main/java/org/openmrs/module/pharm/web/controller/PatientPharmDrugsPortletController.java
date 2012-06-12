package org.openmrs.module.pharm.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.PharmDrug;
import org.openmrs.module.pharm.PharmDrugService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class PatientPharmDrugsPortletController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ModelMap model = new ModelMap();
        String patientIdStr = (String) request.getParameter("patientId");
        Integer patientId = Integer.valueOf(patientIdStr);
        Patient p = Context.getPatientService().getPatient(patientId);
        System.out.println("PatientPharmDrugsPortletController handleRequest **************************\n"
                + "Patient id: " + patientIdStr);
        model.put("patient", p);
        List<PharmDrug> retrievedDrugs = Context.getService(PharmDrugService.class).getPharmDrugsByPatient(p);
        ArrayList<PharmDrug> returnedDrugs = new ArrayList<PharmDrug>();
        returnedDrugs.addAll(retrievedDrugs);
        model.put("pharmDrugs", returnedDrugs);
        return new ModelAndView("/module/pharm/portlets/patientPharmDrugs", model);
    }

    /**
     * WHY DOESN'T THE FOLLOWING MAPPING WORK????
     *
     * @param patient
     * @param title
     * @param text
     * @param returnUrl
     * @return
     */
    @RequestMapping(value = "/module/pharm/addAnotherNote", method = RequestMethod.POST)
    public String addAnotherNote(
            @RequestParam("patient_id") Patient patient,
            @RequestParam("title") String title,
            @RequestParam("text") String text,
            @RequestParam(value = "returnUrl", required = false) String returnUrl) {

        PharmDrug note = new PharmDrug();
        note.setPatient(patient);
        note.setTitle(title);
        note.setText(text);
        // Context.getService(PharmDrug.class).savePharmDrug(note);
        System.out.println("addNote method***************");
        if (returnUrl == null) {
            returnUrl = "notes.form?patient_id=" + patient.getPatientId();
        }

        // this goes to /openmrs/module/pharm/notes.form typically
        return "redirect:" + returnUrl;
    }
}
