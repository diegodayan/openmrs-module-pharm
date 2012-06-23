/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;

/**
 *
 * @author Yan
 */
public interface PatientVisitReasonService extends OpenmrsService {
    
    public PatientVisitReason savePatientVisitReason(PatientVisitReason pvr);
    
    public PatientVisitReason getPatientVisitReason(Integer id);
    
}
