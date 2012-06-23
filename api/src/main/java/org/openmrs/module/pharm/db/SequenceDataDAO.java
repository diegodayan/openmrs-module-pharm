/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.SequenceData;

/**
 *
 * @author Yan
 */
public interface SequenceDataDAO {
    
    public SequenceData getSequenceData(String sequenceName);
    
    public SequenceData saveSequenceData(SequenceData sd);
    
}
