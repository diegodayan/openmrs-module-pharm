/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.pharm.DrugInteraction;
import org.openmrs.propertyeditor.PatientEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/module/pharm/processPrescription.form")
public class PharmDispenseController {

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

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ModelMap map = new ModelMap();
        Integer patientId = new Integer(request.getParameter("patient_id"));
        //Integer patientId = (Integer) request.getAttribute("org.openmrs.portlet.patientId");
        Patient p = Context.getPatientService().getPatient(patientId);
        String drug = request.getParameter("drug");
        System.out.println("pharmDispenseReturnPrescriptions handleRequest called **************************************\n"
                + "Patient id: " + patientId + "  Drug: " + drug);
        map.put("drugInteraction", DrugInteraction.checkInteraction(p, drug));
        map.put("patient", patientId);
        return new ModelAndView("module/pharm/pharmDispenseReturnPrescriptions", map);
    }
}
