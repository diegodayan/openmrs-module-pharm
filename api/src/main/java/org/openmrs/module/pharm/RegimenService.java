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
public interface RegimenService extends OpenmrsService {
    
    public Regimen saveRegimen(Regimen regimen);
    
    public Regimen getRegimen(Integer id);
    
}
