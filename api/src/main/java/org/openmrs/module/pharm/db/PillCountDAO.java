/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.PillCount;

/**
 *
 * @author Yan
 */
public interface PillCountDAO {
    
    public PillCount getPillCount(Integer id);
    
    public PillCount savePillCount(PillCount pc);
    
}
