package org.openmrs.module.pharm.web.controller;

import java.util.ArrayList;
import java.util.Collection;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.Note;
import org.openmrs.module.pharm.NoteService;

public class DWRMyNotesService {

    private Collection<Patient> patients;
    private Collection<Note> notes;

    public Collection<Note> getNotesForPatient(String patientName) {
        System.out.println("My DWR called - notes for: " + patientName);
        ArrayList<Note> nots = new ArrayList<Note>();
        ArrayList<String> texts = new ArrayList<String>();
        patients = Context.getPatientService().getAllPatients();
        NoteService noteService = Context.getService(NoteService.class);
        for (Patient p : patients) {
            nots.addAll(noteService.getNotesByPatient(p));
        }
        return nots;
    }
}
