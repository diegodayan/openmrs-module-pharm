/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;


//            CREATE TABLE `pharm_prescribeddrugs` (
//            `id` int(11) NOT NULL,
//            `amtpertime` double DEFAULT NULL,
//            `drug` int(11) DEFAULT NULL,
//            `prescription` int(11) DEFAULT NULL,
//            `timesperday` int(11) DEFAULT NULL,
//            `modified` char(1) DEFAULT NULL,
//            `prescribeddrugsindex` int(11) DEFAULT NULL,
//            PRIMARY KEY (`id`),
//            KEY `pharm_prescribed_prescription` (`prescription`),
//            KEY `pharm_prescribed_drug` (`drug`),
//            CONSTRAINT `pharm_prescribed_drug` FOREIGN KEY (`drug`) REFERENCES `pharm_drug` (`id`),
//            CONSTRAINT `pharm_prescribed_prescription` FOREIGN KEY (`prescription`) REFERENCES `pharm_prescription` (`id`)
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class PrescribedDrugs {
    
    private Integer id;    
    private Prescription prescription;
    private Integer timesPerDay;
    private Integer prescribedDrugIndex;
    private Drug drug;
    private Double amtPerTime;
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
     * @return the drug
     */
    public Drug getDrug() {
        return drug;
    }

    /**
     * @param drug the drug to set
     */
    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    /**
     * @return the prescription
     */
    public Prescription getPrescription() {
        return prescription;
    }

    /**
     * @param prescription the prescription to set
     */
    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    /**
     * @return the timesPerDay
     */
    public Integer getTimesPerDay() {
        return timesPerDay;
    }

    /**
     * @param timesPerDay the timesPerDay to set
     */
    public void setTimesPerDay(Integer timesPerDay) {
        this.timesPerDay = timesPerDay;
    }

    /**
     * @return the prescribedDrugIndex
     */
    public Integer getPrescribedDrugIndex() {
        return prescribedDrugIndex;
    }

    /**
     * @param prescribedDrugIndex the prescribedDrugIndex to set
     */
    public void setPrescribedDrugIndex(Integer prescribedDrugIndex) {
        this.prescribedDrugIndex = prescribedDrugIndex;
    }

    /**
     * @return the amtPerTime
     */
    public Double getAmtPerTime() {
        return amtPerTime;
    }

    /**
     * @param amtPerTime the amtPerTime to set
     */
    public void setAmtPerTime(Double amtPerTime) {
        this.amtPerTime = amtPerTime;
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
