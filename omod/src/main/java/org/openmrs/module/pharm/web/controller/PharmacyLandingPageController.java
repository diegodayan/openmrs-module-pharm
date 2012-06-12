/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.web.controller;

import javax.servlet.http.HttpSession;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "module/pharm/pharmacyLandingPage.form")
public class PharmacyLandingPageController {
	
	/** Logger for this class and subclasses */
	protected final Log log = LogFactory.getLog(getClass());
	
	/** Success form view name */
	private final String SUCCESS_FORM_VIEW = "/module/pharm/pharmacyLandingPage";  
        
	@RequestMapping(method = RequestMethod.GET)
	public String showForm(){
            System.out.println("PharmacyLandingPageController showForm method***************");
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
	                               @ModelAttribute("anyRequestObject") Object anyRequestObject, BindingResult errors) {
		System.out.println("POST method***************");
		if (errors.hasErrors()) {
			// return error view
		}
		
		return SUCCESS_FORM_VIEW;
	}
	
}
