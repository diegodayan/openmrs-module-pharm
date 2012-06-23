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
public interface StudyService extends OpenmrsService {
    
    public Study saveStudy(Study study);
    
    public Study getStudy(Integer id);
    
}
