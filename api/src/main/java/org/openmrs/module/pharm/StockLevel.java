/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;


//            CREATE TABLE `pharm_stocklevel` (
//            `id` int(4) NOT NULL AUTO_INCREMENT,
//            `batch` int(11) NOT NULL,
//            `fullcontainersremaining` int(11) DEFAULT NULL,
//            `loosepillsremaining` int(11) DEFAULT NULL,
//            PRIMARY KEY (`id`),
//            UNIQUE KEY `pharm_unique_batch` (`batch`),
//            CONSTRAINT `pharm_batch_fkey` FOREIGN KEY (`batch`) REFERENCES `pharm_stock` (`id`)
//            ) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class StockLevel {
    
    private Integer id;
    private Integer batch;
    private Integer fullContainersRemaining;
    private Integer loosePillsRemaining;

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
     * @return the batch
     */
    public Integer getBatch() {
        return batch;
    }

    /**
     * @param batch the batch to set
     */
    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    /**
     * @return the fullContainersRemaining
     */
    public Integer getFullContainersRemaining() {
        return fullContainersRemaining;
    }

    /**
     * @param fullContainersRemaining the fullContainersRemaining to set
     */
    public void setFullContainersRemaining(Integer fullContainersRemaining) {
        this.fullContainersRemaining = fullContainersRemaining;
    }

    /**
     * @return the loosePillsRemaining
     */
    public Integer getLoosePillsRemaining() {
        return loosePillsRemaining;
    }

    /**
     * @param loosePillsRemaining the loosePillsRemaining to set
     */
    public void setLoosePillsRemaining(Integer loosePillsRemaining) {
        this.loosePillsRemaining = loosePillsRemaining;
    }
    
    
}
