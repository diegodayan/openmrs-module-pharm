/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Regimen;

/**
 *
 * @author Yan
 */
public interface RegimenDAO {
    
    public Regimen getRegimen(Integer id);
    
    public Regimen saveRegimen(Regimen regimen);
    
}
