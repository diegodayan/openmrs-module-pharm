/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.web.controller;

import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.Note;
import org.openmrs.module.pharm.NoteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author levine
 */
@org.springframework.stereotype.Controller
//@RequestMapping(value = "/module/pharm/addNote")
//public class PatientRegimensPortletController implements Controller {
public class PatientRegimensPortletController {

    private final String SUCCESS_FORM_VIEW = "/module/pharm/portlets/patientRegimens";

    @RequestMapping(method = RequestMethod.GET)
    public String showForm() {
        System.out.println("PatientRegimensPortletController GET method***************");
        return SUCCESS_FORM_VIEW;
    }

    /*
     * public ModelAndView handleRequest1(HttpServletRequest request,
     * HttpServletResponse response) throws ServletException, IOException {
     *
     * ModelMap map = new ModelMap(); map.put("message", "this is a model
     * property set in the controller");
     *
     * //Integer patientId = (Integer)
     * request.getAttribute("org.openmrs.portlet.patientId"); String
     * patientIdStr = (String) request.getParameter("patientId"); if
     * (patientIdStr == null) { patientIdStr = (String)
     * request.getParameter("patient_id"); } Integer patientId =
     * Integer.valueOf(patientIdStr);
     * System.out.println("PatientRegimensPortletController handleRequest1..
     * Patient Id: " + patientId); Patient p =
     * Context.getPatientService().getPatient(patientId);
     *
     * if (p == null) { System.out.println(" null patient*******"); } else {
     * System.out.println(" Patient: " + p.getFamilyName()); } List<Note> nots =
     * Context.getService(NoteService.class).getNotesByPatient(p);
     * ArrayList<Note> notes = new ArrayList<Note>(); if (nots.size() > 4) { for
     * (int i = 0; i < 4; i++) { notes.add(nots.get(i)); } } else {
     * notes.addAll(nots); } map.put("notes", notes); map.put("patient", p);
     * System.out.println("Number of notes: " + notes.size()); return new
     * ModelAndView("/module/pharm/portlets/patientRegimens", map); }
     */
    @RequestMapping(method = RequestMethod.POST)
    public String addNote(
            @RequestParam("patient_id") Patient patient,
            @RequestParam("title") String title,
            @RequestParam("text") String text,
            @RequestParam(value = "returnUrl", required = false) String returnUrl) {

        Note note = new Note();
        note.setPatient(patient);
        note.setTitle(title);
        note.setText(text);
        Context.getService(NoteService.class).saveNote(note);
        System.out.println("PatientRegimensPortletController addNote method   Title: "
                + title + " Patient Id: " + patient.getPatientId() + "***************\n"
                + "Return URL: " + returnUrl);
        if (returnUrl == null) {
            returnUrl = "/patientDashboard.form?patient_id=" + patient.getPatientId();
        }

        // this goes to /openmrs/module/pharm/notes.form typically
        return "redirect:" + returnUrl;
    }
}
