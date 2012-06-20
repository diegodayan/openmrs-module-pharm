package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_patientvisit` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `patient_id` int(11) DEFAULT NULL,
//   `dateofvisit` date DEFAULT NULL,
//   `isscheduled` varchar(1) DEFAULT NULL,
//   `patientvisitreason_id` int(11) DEFAULT NULL,
//   `diagnosis` varchar(255) DEFAULT NULL,
//   `notes` varchar(255) DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class PatientVisit extends BaseOpenmrsData {

    private Integer id;
    private Integer patientId;
    private Date dateOfVisit;
    private String isScheduled;
    private Integer patientVisitReasonId;
    private String diagnosis;
    private String notes;
    
    public PatientVisit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Date getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(Date dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }
    
    public String getIsScheduled() {
        return isScheduled;
    }

    public void setIsScheduled(String isScheduled) {
        this.isScheduled = isScheduled;
    }
    
    public Integer getPatientVisitReasonId() {
        return patientVisitReasonId;
    }

    public void setPatientVisitReasonId(Integer patientVisitReasonId) {
        this.patientVisitReasonId = patientVisitReasonId;
    }    
    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
