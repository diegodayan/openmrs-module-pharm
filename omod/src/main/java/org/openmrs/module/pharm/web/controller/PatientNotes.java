package org.openmrs.module.pharm.web.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.Note;
import org.openmrs.module.pharm.NoteService;
import org.openmrs.propertyeditor.PatientEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * This class is found by spring because we put "org.openmrs.module.pharm" into
 * the spring "/metadata/webApplicationContext.xml". <br/> <br/> The @Controller
 * annotation right below this is very important.
 *
 */
@Controller
public class PatientNotes implements org.springframework.web.servlet.mvc.Controller {

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

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ModelMap map = new ModelMap();
        map.put("message", "this is a model property set in the controller");
        /*
         * Integer patientId = (Integer)
         * request.getAttribute("org.openmrs.portlet.patientId");
         * System.out.println("PatientNotes.handleRequest..Patient Id: " +
         * patientId); Patient p =
         * Context.getPatientService().getPatient(patientId);
         * System.out.println("portlet controller patient notes in
         * PharmRegimenController"); if (p == null) { System.out.println(" null
         * patient*******"); } else { System.out.println(" Patient: " +
         * p.getFamilyName()); }
         *
         *
         * List<Note> notes =
         * Context.getService(NoteService.class).getNotesByPatient(p);
         * map.put("notes", notes);
         *
         */
        String patientIdStr = (String) request.getParameter("patientId");
        System.out.println("PatientNotes.handleRequest.............. Patiend Id: " + patientIdStr
                + "   other patient id: " + (Integer) request.getAttribute("org.openmrs.portlet.patientId"));
        return new ModelAndView("/module/pharm/portlets/patientNotes", map);
    }

    protected void populateModel(HttpServletRequest request, Map<String, Object> model) {
        Patient patient = (Patient) model.get("patient");
        System.out.println("portlet controller patient notes in PatientNotesPortletController**************************");
        List<Note> notes = Context.getService(NoteService.class).getNotesByPatient(patient);
        model.put("notes", notes);
    }

    /**
     * This method is called when the url /openmrs/module/pharm/notes.form is
     * visited with EITHER a POST or GET (aka someone submitting the form or
     * viewing the page for the first time)
     *
     * @param model a spring object. We put make variables available to our jsp
     * through this object
     * @param patient The patient associated with the "patient_id" query
     * parameter in the url
     */
    @RequestMapping("/module/pharm/notes")
    public void showNotes(ModelMap model,
            @RequestParam("patient_id") Patient patient) {
        System.out.println("showNotes in PatientNotesController*****************");
        // we have "Patient" object here because of the initBinder method above

        // get our custom service so we can fetch notes
        NoteService service = Context.getService(NoteService.class);

        // make a variable called "patient" that is the Patient object that has
        // the given patient_id. Access this via ${patient.personName.fullName}
        // (this calls Patient.getPersonName().getFullName())
        model.addAttribute("patient", patient);
        model.addAttribute("notes", service.getNotesByPatient(patient));
    }
    /**
     * This method is called after someone hits "submit" (and if the &lt;form>
     * element has method="POST"...) on a url like /module/pharm/addNote.form .
     *
     * @param patient the Patient object because of the patient_id query
     * parameter (see initBinder method above)
     * @param title the title entered by the user
     * @param text the text entered by the user
     * @param returnUrl a hidden element added to the &lt;form> element by the
     * user
     * @return the name of the page to go back to.
     */
}
