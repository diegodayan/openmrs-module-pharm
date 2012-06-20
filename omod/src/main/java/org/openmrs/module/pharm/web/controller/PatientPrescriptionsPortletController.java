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
import org.openmrs.module.pharm.Prescription;
import org.openmrs.module.pharm.PrescriptionService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class PatientPrescriptionsPortletController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ModelMap model = new ModelMap();
        String patientIdStr = (String) request.getParameter("patientId");
        Integer patientId = Integer.valueOf(patientIdStr);
        Patient p = Context.getPatientService().getPatient(patientId);
        model.put("patient", p);
        List<Prescription> ps = Context.getService(PrescriptionService.class).getPrescriptionsByPatient(p);
        ArrayList<Prescription> prescriptions = new ArrayList<Prescription>();
        prescriptions.addAll(ps);
        model.put("prescriptions", prescriptions);
        return new ModelAndView("/module/pharm/portlets/patientPrescriptions", model);
    }
}
