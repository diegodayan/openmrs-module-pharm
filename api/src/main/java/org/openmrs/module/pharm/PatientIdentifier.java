package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_patientidentifier` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `value` varchar(255) NOT NULL,
//   `patient_id` int(11) NOT NULL,
//   `type_id` int(11) NOT NULL,
//   PRIMARY KEY (`id`),
//   UNIQUE KEY `pharm_unique_identifier_type` (`type_id`,`value`),
//   KEY `pharm_patientidentifier_patient` (`patient_id`),
//   CONSTRAINT `pharm_patientidentifier_identifiertype` FOREIGN KEY (`type_id`) REFERENCES `pharm_identifiertype` (`id`),
//   CONSTRAINT `pharm_patientidentifier_patient` FOREIGN KEY (`patient_id`) REFERENCES `pharm_patient` (`id`)
// ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class PatientIdentifier extends BaseOpenmrsData {

    private Integer id;
    private String value;
    private Integer patientId;
    private Integer typeId;
    
    public PatientIdentifier() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }
    
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
