package org.openmrs.module.pharm.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.saxon.exslt.Date;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.Note;
import org.openmrs.module.pharm.NoteService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class PatientNotesPortletController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ModelMap model = new ModelMap();
        //Integer patientId = (Integer) request.getAttribute("patientId");
        String patientIdStr = (String) request.getParameter("patientId");
        Integer patientId = Integer.valueOf(patientIdStr);
        Patient p = Context.getPatientService().getPatient(patientId);
        System.out.println("PatientNotesPortletController handleRequest **************************\n"
                + "Patient id: " + patientIdStr);
        model.put("patient", p);
        List<Note> nots = Context.getService(NoteService.class).getNotesByPatient(p);
        ArrayList<Note> notes = new ArrayList<Note>();
        if (nots.size() > 4) {
            for (int i = 0; i < 4; i++) {
                notes.add(nots.get(i));
            }
        } else {
            notes.addAll(nots);
        }
        model.put("notes", notes);
        return new ModelAndView("/module/pharm/portlets/patientNotes", model);
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

        Note note = new Note();
        note.setPatient(patient);
        note.setTitle(title);
        note.setText(text);
        Context.getService(NoteService.class).saveNote(note);
        System.out.println("addNote method***************");
        if (returnUrl == null) {
            returnUrl = "notes.form?patient_id=" + patient.getPatientId();
        }

        // this goes to /openmrs/module/pharm/notes.form typically
        return "redirect:" + returnUrl;
    }
}
