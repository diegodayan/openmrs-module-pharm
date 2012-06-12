package org.openmrs.module.pharm;

import org.openmrs.Patient;

/**
 * This class demonstrates the use of backend business services provided in the web application
 * @author levine
 */
public class DrugInteraction {
    public static String checkInteraction(Patient p, String drug) {
        return "Drug: " + drug + " interacts for patient " + p.getGivenName() + " " + p.getFamilyName();
    }
}
