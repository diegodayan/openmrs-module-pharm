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
public interface RegimenDrugsService extends OpenmrsService {
    
    public RegimenDrugs saveRegimenDrugs(RegimenDrugs rd);
    
    public RegimenDrugs getRegimenDrugs(Integer id);
    
}
