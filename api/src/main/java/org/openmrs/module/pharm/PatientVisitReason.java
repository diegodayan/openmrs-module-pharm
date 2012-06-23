/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

//            CREATE TABLE `pharm_patientvisitreason` (
//            `id` int(4) NOT NULL AUTO_INCREMENT,
//           `reasonforvisit` varchar(50) DEFAULT NULL,
//            PRIMARY KEY (`id`)
//            ) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class PatientVisitReason {
    
    private Integer id;
    private String reasonForVisit;

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
     * @return the reasonForVisit
     */
    public String getReasonForVisit() {
        return reasonForVisit;
    }

    /**
     * @param reasonForVisit the reasonForVisit to set
     */
    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }
    
    
    
}
