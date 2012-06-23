/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.PatientVisitReason;

/**
 *
 * @author Yan
 */
public interface PatientVisitReasonDAO {
    
    public PatientVisitReason getPatientVisitReason(Integer id);
    
    public PatientVisitReason savePatientVisitReason(PatientVisitReason pvr);
    
}
