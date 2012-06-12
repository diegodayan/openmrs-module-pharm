package org.openmrs.module.pharm.web.controller;

import java.util.ArrayList;
import java.util.Collection;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.Note;
import org.openmrs.module.pharm.NoteService;

/**
 *
 * @author levine
 */
public class PatientAndNotes {

    private Collection<Patient> patients;
    private Collection<Note> notes;

    public PatientAndNotes() {
        ArrayList<Note> nots = new ArrayList<Note>();
        patients = Context.getPatientService().getAllPatients();
        NoteService noteService = Context.getService(NoteService.class);
        Patient p1 = new Patient();
        for (Patient p : patients) {
            p1 = p;
            Note note = new Note(); // create our Note object to save
            note.setPatient(p); // add our Patient "stub" (just id) to mark
            // this note for
            note.setTitle("War and Peace"); // the subject of the note
            note.setText("That's a long book by: " + p.getGivenName()); // the content of the note
            noteService.saveNote(note); // persist the note in the database   
            //nots.add(note);
        }
        for (Patient p : patients) {
            nots.addAll(noteService.getNotesByPatient(p));
        }
        notes = nots;
    }

    /**
     * We need to provide this getter, and the Note getter to retrieve the
     * patients in the corresponding jsp
     *
     * @return Collection of Patients
     */
    public Collection<Patient> getPatients() {
        return patients;
    }

    public Collection<Note> getNotes() {
        return notes;
    }
}
