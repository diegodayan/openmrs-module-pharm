/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.Study;

/**
 *
 * @author Yan
 */
public interface StudyDAO {
    
    public Study getStudy(Integer id);
    
    public Study saveStudy(Study study);
    
}
