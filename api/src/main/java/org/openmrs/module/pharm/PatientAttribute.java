package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_patientattribute` (
//   `id` int(11) NOT NULL,
//   `value` varchar(255) DEFAULT NULL,
//   `patient` int(11) DEFAULT NULL,
//   `type_id` int(11) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_patientattribute_attributetype` (`type_id`),
//   KEY `pharm_patientattribute_patient` (`patient`),
//   CONSTRAINT `pharm_patientattribute_patient` FOREIGN KEY (`patient`) REFERENCES `pharm_patient` (`id`),
//   CONSTRAINT `pharm_patientattribute_attributetype` FOREIGN KEY (`type_id`) REFERENCES `pharm_attributetype` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/**
 *
 * 
 */
public class PatientAttribute extends BaseOpenmrsData {

    private Integer id;
    private String value;
    private Integer patient;
    private Integer typeId;
    
    public PatientAttribute() {
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
    
    public Integer getPatient() {
        return patient;
    }

    public void setPatient(Integer patient) {
        this.patient = patient;
    }
    
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
