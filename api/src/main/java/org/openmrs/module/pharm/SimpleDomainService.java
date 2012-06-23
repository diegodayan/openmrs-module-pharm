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
public interface SimpleDomainService extends OpenmrsService {
    
    public SimpleDomain saveSimpleDomain(SimpleDomain sd);
    
    public SimpleDomain getSimpleDomain(Integer id);
    
}
