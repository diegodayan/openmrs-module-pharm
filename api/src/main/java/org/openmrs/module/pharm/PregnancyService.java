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
public interface PregnancyService extends OpenmrsService {
    
    public Pregnancy savePregnancy(Pregnancy pregnancy);
    
    public Pregnancy getPregnancy(Integer id);
    
}
