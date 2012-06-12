/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.web.controller;

import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.Note;
import org.openmrs.module.pharm.NoteService;

/**
 *
 * @author levine
 */
public class DWRSaveNoteBL {

    public String saveNoteForPatient(String patientId, String title, String text) {
        //System.out.println("DWRSaveNote - note for: " + patientId + " Title: " + title + " Text: " + text);
        Patient patient = Context.getPatientService().getPatient(Integer.valueOf(patientId));
        Note note = new Note();
        note.setPatient(patient);
        note.setTitle(title);
        note.setText(text);
        Context.getService(NoteService.class).saveNote(note);
        return "Note Saved for Patient: " + patient.getGivenName() + " " + patient.getFamilyName()
                + " Title: " + title + "Text: " + text;
    }
}
