package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;
// CREATE TABLE `pharm_clinic` (
//   `id` int(11) NOT NULL,
//   `notes` varchar(255) DEFAULT NULL,
//   `telephone` varchar(255) DEFAULT NULL,
//   `mainclinic` tinyint(1) DEFAULT NULL,
//   `clinicname` varchar(255) DEFAULT NULL,
//   `clinicdetails_id` int(11) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   UNIQUE KEY `pharm_unique_clinicname` (`clinicname`),
//   KEY `pharm_fkey_clinic_details` (`clinicdetails_id`),
//   CONSTRAINT `pharm_fkey_clinic_details` FOREIGN KEY (`clinicdetails_id`) REFERENCES `pharm_nationalclinics` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class Clinic extends BaseOpenmrsData {

    private Integer id;
    private String notes;
    private String telephone;
    private Integer mainClinic;
    private String clinicName;
    private Integer clinicDetailsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getMainClinic() {
        return mainClinic;
    }

    public void setMainClinic(Integer mainClinic) {
        this.mainClinic = mainClinic;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public Integer getClinicDetailsId() {
        return clinicDetailsId;
    }

    public void setClinicDetailsId(Integer clinicDetailsId) {
        this.clinicDetailsId = clinicDetailsId;
    }
}
