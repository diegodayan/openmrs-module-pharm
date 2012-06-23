/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;


//            CREATE TABLE `pharm_study` (
//            `id` int(4) NOT NULL AUTO_INCREMENT,
//            `studyname` varchar(255) NOT NULL,
//            PRIMARY KEY (`id`),
//            UNIQUE KEY `pharm_studyname` (`studyname`)
//            ) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/**
 *
 * @author Yan
 */
public class Study {
    
    private Integer id;
    private String studyName;

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
     * @return the studyName
     */
    public String getStudyName() {
        return studyName;
    }

    /**
     * @param studyName the studyName to set
     */
    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }
    
    
}
