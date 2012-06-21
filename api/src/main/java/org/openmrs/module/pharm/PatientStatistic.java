package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_patientstatistic` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `entry_id` int(11) DEFAULT NULL,
//   `patient_id` int(11) DEFAULT NULL,
//   `datetested` date DEFAULT NULL,
//   `daterecorded` date DEFAULT NULL,
//   `patientstattype_id` int(11) DEFAULT NULL,
//   `statnumeric` double DEFAULT NULL,
//   `stattext` varchar(255) DEFAULT NULL,
//   `statdate` date DEFAULT NULL,
//   PRIMARY KEY (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class PatientStatistic extends BaseOpenmrsData {

    private Integer id;
    private Integer entryId;
    private Integer patientId;
    private Date dateTested;
    private Date dateRecorded;
    private Integer patientStatTypeId;
    private Double statNumeric;
    private String statText;
    private Date statDate;
    
    public PatientStatistic() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getEntryId() {
        return entryId;
    }

    public void setEntryId(Integer entryId) {
        this.entryId = entryId;
    }
    
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Date getDateTested() {
        return dateTested;
    }

    public void setDateTested(Date dateTested) {
        this.dateTested = dateTested;
    }
    
    public Date getDateRecorded() {
        return dateRecorded;
    }

    public void setDateRecorded(Date dateRecorded) {
        this.dateRecorded = dateRecorded;
    }    
    
    public Integer getPatientStatTypeId() {
        return patientStatTypeId;
    }

    public void setPatientStatTypeId(Integer patientStatTypeId) {
        this.patientStatTypeId = patientStatTypeId;
    }    
    
    public Double getStatNumeric() {
        return statNumeric;
    }

    public void setStatNumeric(Double statNumeric) {
        this.statNumeric = statNumeric;
    }        

    public String getStatText() {
        return statText;
    }

    public void setStatText(String statText) {
        this.statText = statText;
    }
    
    public Date getStatDate() {
        return statDate;
    }

    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }
}
