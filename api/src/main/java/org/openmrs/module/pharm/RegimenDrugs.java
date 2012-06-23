/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;


//            CREATE TABLE `pharm_regimendrugs` (
//            `id` int(4) NOT NULL AUTO_INCREMENT,
//            `amtpertime` double DEFAULT NULL,
//            `drug` int(11) DEFAULT NULL,
//            `modified` char(1) DEFAULT NULL,
//            `regimen` int(11) DEFAULT NULL,
//            `timesperday` int(11) DEFAULT NULL,
//            `notes` varchar(255) DEFAULT NULL,
//            `regimendrugsindex` int(11) DEFAULT NULL,
//            PRIMARY KEY (`id`),
//            UNIQUE KEY `pharm_unique_regimendrug` (`regimen`,`drug`),
//            KEY `pharm_drug_fkey0` (`drug`),
//            CONSTRAINT `pharm_drug_fkey0` FOREIGN KEY (`drug`) REFERENCES `pharm_drug` (`id`),
//            CONSTRAINT `pharm_regimen_fkey` FOREIGN KEY (`regimen`) REFERENCES `pharm_regimen` (`id`)
//            ) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class RegimenDrugs {
    
    private Integer id;
    private Integer timesPerDay;
    private Integer regimenDrugIndex;
    private Double amtPerTime;
    private String modified;
    private Drug drug;
    private Regimen regimen;    
    private Note notes;

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
     * @return the regimenDrugIndex
     */
    public Integer getRegimenDrugIndex() {
        return regimenDrugIndex;
    }

    /**
     * @param regimenDrugIndex the regimenDrugIndex to set
     */
    public void setRegimenDrugIndex(Integer regimenDrugIndex) {
        this.regimenDrugIndex = regimenDrugIndex;
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
     * @return the regimen
     */
    public Regimen getRegimen() {
        return regimen;
    }

    /**
     * @param regimen the regimen to set
     */
    public void setRegimen(Regimen regimen) {
        this.regimen = regimen;
    }

    /**
     * @return the notes
     */
    public Note getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(Note notes) {
        this.notes = notes;
    }
    
    
}
