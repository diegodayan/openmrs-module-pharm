/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.Patient;


//            CREATE TABLE `pharm_studyparticipant` (
//            `id` int(4) NOT NULL AUTO_INCREMENT,
//            `studygroup` varchar(255) NOT NULL,
//            `startdate` date DEFAULT NULL,
//            `enddate` date DEFAULT NULL,
//            `patient` int(11) NOT NULL,
//            `study` int(11) NOT NULL,
//            `randomizationid` varchar(40) DEFAULT NULL,
//            `alternatecellphone` varchar(20) DEFAULT NULL,
//            `network` varchar(40) NOT NULL,
//            `language` varchar(50) DEFAULT NULL,
//            PRIMARY KEY (`id`),
//            KEY `pharm_studyparticipant_patient_fkey` (`patient`),
//            KEY `pharm_studyparticipant_study_fkey` (`study`),
//            CONSTRAINT `pharm_studyparticipant_patient_fkey` FOREIGN KEY (`patient`) REFERENCES `pharm_patient` (`id`),
//            CONSTRAINT `pharm_studyparticipant_study_fkey` FOREIGN KEY (`study`) REFERENCES `pharm_study` (`id`)
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class StudyParticipant {
    
    private Integer id;
    private String studyGroup;
    private Study study;
    private String randomizationId;
    private String alternateCellphone;
    private String network;
    private String language;
    private Date startDate;
    private Date endDate;
    private Patient patient;

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
     * @return the studyGroup
     */
    public String getStudyGroup() {
        return studyGroup;
    }

    /**
     * @param studyGroup the studyGroup to set
     */
    public void setStudyGroup(String studyGroup) {
        this.studyGroup = studyGroup;
    }

    /**
     * @return the study
     */
    public Study getStudy() {
        return study;
    }

    /**
     * @param study the study to set
     */
    public void setStudy(Study study) {
        this.study = study;
    }

    /**
     * @return the randomizationId
     */
    public String getRandomizationId() {
        return randomizationId;
    }

    /**
     * @param randomizationId the randomizationId to set
     */
    public void setRandomizationId(String randomizationId) {
        this.randomizationId = randomizationId;
    }

    /**
     * @return the alternateCellphone
     */
    public String getAlternateCellphone() {
        return alternateCellphone;
    }

    /**
     * @param alternateCellphone the alternateCellphone to set
     */
    public void setAlternateCellphone(String alternateCellphone) {
        this.alternateCellphone = alternateCellphone;
    }

    /**
     * @return the network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * @param network the network to set
     */
    public void setNetwork(String network) {
        this.network = network;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
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
    
}
