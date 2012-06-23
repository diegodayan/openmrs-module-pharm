/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import java.util.Date;

//            CREATE TABLE `pharm_pillcount` (
//            `id` int(11) NOT NULL,
//            `accum` int(11) NOT NULL,
//            `previouspackage` int(11) NOT NULL,
//            `dateofcount` datetime NOT NULL,
//            `drug` int(11) NOT NULL,
//            PRIMARY KEY (`id`),
//            KEY `pharm_previouspackage_fkey` (`previouspackage`),
//            KEY `pharm_drug_fkey2` (`drug`),
//            CONSTRAINT `pharm_drug_fkey2` FOREIGN KEY (`drug`) REFERENCES `pharm_drug` (`id`),
//            CONSTRAINT `pharm_previouspackage_fkey` FOREIGN KEY (`previouspackage`) REFERENCES `pharm_package` (`id`)
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class PillCount {
    
    private Integer id;
    private Integer accum;
    private Integer previousPackage;    
    private Drug drug;
    private Date dateOfCount;

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
     * @return the accum
     */
    public Integer getAccum() {
        return accum;
    }

    /**
     * @param accum the accum to set
     */
    public void setAccum(Integer accum) {
        this.accum = accum;
    }

    /**
     * @return the previousPackage
     */
    public Integer getPreviousPackage() {
        return previousPackage;
    }

    /**
     * @param previousPackage the previousPackage to set
     */
    public void setPreviousPackage(Integer previousPackage) {
        this.previousPackage = previousPackage;
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
     * @return the dateOfCount
     */
    public Date getDateOfCount() {
        return dateOfCount;
    }

    /**
     * @param dateOfCount the dateOfCount to set
     */
    public void setDateOfCount(Date dateOfCount) {
        this.dateOfCount = dateOfCount;
    }
    
    
}
