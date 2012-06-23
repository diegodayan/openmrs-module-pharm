/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.SimpleDomain;

/**
 *
 * @author Yan
 */
public interface SimpleDomainDAO {
    
    public SimpleDomain getSimpleDomain(Integer id);
    
    public SimpleDomain saveSimpleDomain(SimpleDomain sd);
    
}
