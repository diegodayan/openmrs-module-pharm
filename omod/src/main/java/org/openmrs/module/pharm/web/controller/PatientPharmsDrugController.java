package org.openmrs.module.pharm.web.controller;

import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.PharmDrug;
import org.openmrs.module.pharm.PharmDrugService;
import org.openmrs.propertyeditor.PatientEditor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * This class is found by spring because we put "org.openmrs.module.pharm"
 * into the spring "/metadata/webApplicationContext.xml". <br/> <br/> The
 * @Controller annotation right below this is very important.
 *
 */
//@Controller
public class PatientPharmsDrugController {

    /**
     * This method is called by spring to let it know how to convert from an
     * String patientId to a Patient object. The "showNotes" method takes in a
     * parameter called patient_id which is of type {@link Patient}. <br/> <br/>
     * There are a lot of property editors for openmrs objects in
     * org.openmrs.propertyeditor package.
     *
     * @param wdb a spring class we register "custom editors" with.
     */
    /*
     * This allows the jsp data entry to update the form backing object
     * properties automatically without having to get the info from the form and
     * updating via code
     */
    @InitBinder
    public void initBinder(WebDataBinder wdb) {
        wdb.registerCustomEditor(Patient.class, new PatientEditor());
    }

    /**
     * This method is called when the url /openmrs/module/pharm/notes.form
     * is visited with EITHER a POST or GET (aka someone submitting the form or
     * viewing the page for the first time)
     *
     * @param model a spring object. We put make variables available to our jsp
     * through this object
     * @param patient The patient associated with the "patient_id" query
     * parameter in the url
     */
    @RequestMapping("/module/pharm/pharmDrugs")
    public void showNotes(ModelMap model,
            @RequestParam("patient_id") Patient patient) {
        System.out.println("showPharmDrugs in PatientPharmDrugsController*****************");
        // we have "Patient" object here because of the initBinder method above

        // get our custom service so we can fetch notes
        PharmDrugService service = Context.getService(PharmDrugService.class);

        // make a variable called "patient" that is the Patient object that has
        // the given patient_id. Access this via ${patient.personName.fullName}
        // (this calls Patient.getPersonName().getFullName())
        model.addAttribute("patient", patient);
        model.addAttribute("pharmDrugs", service.getPharmDrugsByPatient(patient));
    }

    /**
     * This method is called after someone hits "submit" (and if the &lt;form>
     * element has method="POST"...) on a url like
     * /module/pharm/addNote.form .
     *
     * @param patient the Patient object because of the patient_id query
     * parameter (see initBinder method above)
     * @param title the title entered by the user
     * @param text the text entered by the user
     * @param returnUrl a hidden element added to the &lt;form> element by the
     * user
     * @return the name of the page to go back to.
     */
    @RequestMapping(value = "/module/pharm/addNote", method = RequestMethod.POST)
    public String addNote(
            @RequestParam("patient_id") Patient patient,
            @RequestParam("title") String title,
            @RequestParam("text") String text,
            @RequestParam(value = "returnUrl", required = false) String returnUrl) {

        PharmDrug note = new PharmDrug();
        note.setPatient(patient);
        note.setTitle(title);
        note.setText(text);
        Context.getService(PharmDrugService.class).savePharmDrug(note);
        System.out.println("addNote method***************");
        if (returnUrl == null) {
            returnUrl = "notes.form?patient_id=" + patient.getPatientId();
        }

        // this goes to /openmrs/module/pharm/notes.form typically
        return "redirect:" + returnUrl;
    }
}
