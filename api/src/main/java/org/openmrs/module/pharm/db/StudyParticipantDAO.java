/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.StudyParticipant;

/**
 *
 * @author Yan
 */
public interface StudyParticipantDAO {
    
    public StudyParticipant getStudyParticipant(Integer id);
    
    public StudyParticipant saveStudyParticipant(StudyParticipant sp);
    
}
