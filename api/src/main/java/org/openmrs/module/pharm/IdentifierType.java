package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_identifiertype` (
//   `id` int(11) NOT NULL,
//   `name` varchar(255) NOT NULL,
//   `index` int(11) DEFAULT NULL,
//   `voided` tinyint(1) NOT NULL DEFAULT '0',
//   PRIMARY KEY (`id`),
//   UNIQUE KEY `pharm_name` (`name`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class IdentifierType extends BaseOpenmrsData {
    
    private Integer id;
    private String name;
    private Integer index;
    private Byte voided;
    
    public IdentifierType() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }        

    public Byte getVoidedFlag() {
        return voided;
    }

    public void setVoidedFlag(Byte voided) {
        this.voided = voided;
    }    
}
