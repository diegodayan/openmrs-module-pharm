/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.RegimenDrugs;

/**
 *
 * @author Yan
 */
public interface RegimenDrugsDAO {
    
    public RegimenDrugs getRegimenDrugs(Integer id);
    
    public RegimenDrugs saveRegimenDrugs(RegimenDrugs rd);
    
}
