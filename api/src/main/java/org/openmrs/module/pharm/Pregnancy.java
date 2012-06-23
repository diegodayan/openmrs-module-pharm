/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.Patient;

//            CREATE TABLE `pharm_pregnancy` (
//            `id` int(4) NOT NULL AUTO_INCREMENT,
//            `confirmdate` datetime DEFAULT NULL,
//            `enddate` datetime DEFAULT NULL,
//            `patient` int(11) NOT NULL,
//            `modified` char(1) DEFAULT NULL,
//            PRIMARY KEY (`id`),
//            KEY `pharm_pregnancy_patient` (`patient`),
//            CONSTRAINT `pharm_pregnancy_patient` FOREIGN KEY (`patient`) REFERENCES `pharm_patient` (`id`)
//            ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class Pregnancy {
    
    private Integer id;
    private Patient patient;
    private Date confirmDate;
    private Date endDate;
    private String modified;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * @return the confirmDate
     */
    public Date getConfirmDate() {
        return confirmDate;
    }

    /**
     * @param confirmDate the confirmDate to set
     */
    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the modified
     */
    public String getModified() {
        return modified;
    }

    /**
     * @param modified the modified to set
     */
    public void setModified(String modified) {
        this.modified = modified;
    }
    
    
    
}
