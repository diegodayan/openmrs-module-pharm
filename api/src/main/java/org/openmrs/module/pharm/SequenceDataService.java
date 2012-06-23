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
public interface SequenceDataService extends OpenmrsService {
    
    public SequenceData saveSequenceData(SequenceData sd);
    
    public SequenceData getSequenceData(String sequenceName);
    
}
