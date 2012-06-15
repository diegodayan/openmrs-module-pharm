/**
 * The contents of this file are subject to the OpenMRS Public License Version
 * 1.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 *
 * Copyright (C) OpenMRS, LLC. All Rights Reserved.
 */
package org.openmrs.module.pharm.web.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * This class configured as controller using annotation and mapped with the URL
 * of 'module/pharm/pharmTestPage.form'.
 */
@Controller
@RequestMapping(value = "module/pharm/pharmTestPage.form")
public class PharmTestPageController {

    /**
     * Logger for this class and subclasses
     */
    protected final Log log = LogFactory.getLog(getClass());
    /**
     * Success form view name
     */
    private final String SUCCESS_FORM_VIEW = "/module/pharm/pharmTestPage";

    /**
     * Initially called after the formBackingObject method to get the landing
     * form name
     *
     * @return String form view name
     */
    @RequestMapping(method = RequestMethod.GET)
    public String showForm() {
        System.out.println("GET method***************");
        return SUCCESS_FORM_VIEW;
    }

    /**
     * All the parameters are optional based on the necessity
     *
     * @param httpSession
     * @param anyRequestObject
     * @param errors
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(HttpSession httpSession,
            @ModelAttribute("anyRequestObject") Object anyRequestObject,
            BindingResult errors) {
        System.out.println("POST method***************");
        if (errors.hasErrors()) {
            // return error view
        }
        return SUCCESS_FORM_VIEW;
    }

    /**
     * This class returns the form backing object. This can be a string, a
     * boolean, or a normal java pojo. The bean name defined in the
     * ModelAttribute annotation and the type can be just defined by the return
     * type of this method
     */
    @ModelAttribute("data")
    protected ModelMap formBackingObject(HttpServletRequest request) throws Exception {
        ModelMap model = new ModelMap();
        ArrayList<AdherenceRecordTmp> arts = new ArrayList<AdherenceRecordTmp>();
        AdherenceRecordTmp art;
        for (int i = 1; i < 10; i++) {
            art = Context.getService(AdherenceRecordTmpService.class).getAdherenceRecordTmp(Integer.valueOf(i));
            if (art != null) {
                arts.add(art);
            }
        }
        model.put("adherenceRecords", arts);
        model.put("message", "Hi buddy!");
        model.put("pink", "Any colour you like!");
        return model;
    }

    public void saveNote_shouldCreateANote() throws Exception {
        NoteService service = Context.getService(NoteService.class);
        Patient patient = new Patient(2); // we can do this instead of doing
        // Context.getPatientService().getPatient(2)
        // because hibernate only looks at
        // the primary key object when
        // referencing this in the DAO

        Note note = new Note(); // create our Note object to save
        note.setPatient(patient); // add our Patient "stub" (just id) to mark
        // this note for
        note.setTitle("War and Peace"); // the subject of the note
        note.setText("That's a long book"); // the content of the note
        service.saveNote(note); // persist the note in the database

        // now do the testing

        List<Note> notes = service.getNotesByPatient(patient); // get all notes
        // for the #2
        System.out.println("notes.size(): " + notes.size());
        /*
         * patient Assert.assertEquals(1, notes.size()); // there should only be
         * 1 note for // this patient
         * Assert.assertNotNull(notes.get(0).getCreator()); // the "creator"
         * should // be set by the SaveHandler because we called a method that
         * started with 'save' and the // first argument was an "Auditable"
         * object
         *
         */
    }
}
