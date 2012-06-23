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
public interface PillCountService extends OpenmrsService {
    
    public PillCount savePillCount(PillCount pc);
    
    public PillCount getPillCount(Integer id);
    
}
