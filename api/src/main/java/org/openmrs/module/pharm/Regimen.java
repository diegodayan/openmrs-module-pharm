/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;


//            CREATE TABLE `pharm_regimen` (
//            `id` int(11) NOT NULL,
//            `modified` char(1) DEFAULT NULL,
//            `notes` varchar(255) DEFAULT NULL,
//            `regimenname` varchar(255) DEFAULT NULL,
//            `druggroup` varchar(255) DEFAULT NULL,
//            PRIMARY KEY (`id`),
//            UNIQUE KEY `pharm_unique_regimen` (`regimenname`,`druggroup`)
//            ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class Regimen {
    
    private Integer id;
    private Note notes;
    private String modified;
    private String regimenName;
    private String drugGroup;

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
     * @return the regimenName
     */
    public String getRegimenName() {
        return regimenName;
    }

    /**
     * @param regimenName the regimenName to set
     */
    public void setRegimenName(String regimenName) {
        this.regimenName = regimenName;
    }

    /**
     * @return the drugGroup
     */
    public String getDrugGroup() {
        return drugGroup;
    }

    /**
     * @param drugGroup the drugGroup to set
     */
    public void setDrugGroup(String drugGroup) {
        this.drugGroup = drugGroup;
    }
    
}
