package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_episode` (
//   `id` int(11) NOT NULL,
//   `startdate` datetime NOT NULL,
//   `stopdate` datetime DEFAULT NULL,
//   `startreason` varchar(255) DEFAULT NULL,
//   `stopreason` varchar(255) DEFAULT NULL,
//   `startnotes` varchar(255) DEFAULT NULL,
//   `stopnotes` varchar(255) DEFAULT NULL,
//   `patient` int(11) DEFAULT NULL,
//   `index` int(11) DEFAULT NULL,
//   `clinic` int(11) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_fk_episode_patient` (`patient`),
//   KEY `pharm_episode_clinic_fkey` (`clinic`),
//   CONSTRAINT `pharm_episode_clinic_fkey` FOREIGN KEY (`clinic`) REFERENCES `pharm_clinic` (`id`),
//   CONSTRAINT `pharm_fk_episode_patient` FOREIGN KEY (`patient`) REFERENCES `pharm_patient` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class Episode extends BaseOpenmrsData {
    
    private Integer id;
    private Date startDate;
    private Date stopDate;
    private String startReason;
    private String stopReason;
    private String startNotes;
    private String stopNotes;
    private Integer patient;
    private Integer index;
    private Integer clinic;
    
    public Episode() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }    
    
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }    
    
    public Date getStopDate() {
        return stopDate;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }    

    public String getStartReason() {
        return startReason;
    }

    public void setStartReason(String startReason) {
        this.startReason = startReason;
    }
        
    public String getStopReason() {
        return stopReason;
    }

    public void setStopReason(String stopReason) {
        this.stopReason = stopReason;
    }
        
    public String getStartNotes() {
        return startNotes;
    }

    public void setStartNotes(String startNotes) {
        this.startNotes = startNotes;
    }
        
    public String getStopNotes() {
        return stopNotes;
    }

    public void setStopNotes(String stopNotes) {
        this.stopNotes = stopNotes;
    }
        
    public Integer getPatient() {
        return patient;
    }

    public void setPatient(Integer patient) {
        this.patient = patient;
    }        
    
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }        
    
    public Integer getClinic() {
        return clinic;
    }

    public void setClinic(Integer clinic) {
        this.clinic = clinic;
    }        
}
