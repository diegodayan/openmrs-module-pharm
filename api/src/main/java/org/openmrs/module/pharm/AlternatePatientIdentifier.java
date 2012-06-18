package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;
import org.openmrs.Patient;

// CREATE TABLE `pharm_alternatepatientidentifier` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `identifier` varchar(255) DEFAULT NULL,
//   `patient` int(11) DEFAULT NULL,
//   `datechanged` datetime DEFAULT NULL,
//   `masterpatientid` tinyint(1) DEFAULT NULL,
//   `type_id` int(11) NOT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_alternateid_patient` (`patient`),
//   CONSTRAINT `pharm_alternateid_patient` FOREIGN KEY (`patient`) REFERENCES `pharm_patient` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class AlternatePatientIdentifier extends BaseOpenmrsData {

    private Integer id;
    private String identifier;
    private Patient patient;
    private Date dateChanged;
    private Patient masterPatient;
    private Integer typeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Date getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }

    public Patient getMasterPatient() {
        return masterPatient;
    }

    public void setMasterPatient(Patient masterPatient) {
        this.masterPatient = masterPatient;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }
}
