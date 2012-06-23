/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.PrescribedDrugs;

/**
 *
 * @author Yan
 */
public interface PrescribedDrugsDAO {
    
    public PrescribedDrugs getPrescribedDrugs(Integer id);
    
    public PrescribedDrugs savePrescribedDrugs(PrescribedDrugs pd);
    
}
