/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Pregnancy;

/**
 *
 * @author Yan
 */
public interface PregnancyDAO {
    
    public Pregnancy getPregnancy(Integer id);
    
    public Pregnancy savePregnancy(Pregnancy pregnancy);
    
}
