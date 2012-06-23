package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;
// CREATE TABLE `pharm_prescribeddrugs` (
//   `id` int(11) NOT NULL,
//   `amtpertime` double DEFAULT NULL,
//   `drug` int(11) DEFAULT NULL,
//   `prescription` int(11) DEFAULT NULL,
//   `timesperday` int(11) DEFAULT NULL,
//   `modified` char(1) DEFAULT NULL,
//   `prescribeddrugsindex` int(11) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_prescribed_prescription` (`prescription`),
//   KEY `pharm_prescribed_drug` (`drug`),
//   CONSTRAINT `pharm_prescribed_drug` FOREIGN KEY (`drug`) REFERENCES `pharm_drug` (`id`),
//  CONSTRAINT `pharm_prescribed_prescription` FOREIGN KEY (`prescription`) REFERENCES `pharm_prescription` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

public class PrescribedDrug extends BaseOpenmrsData {

    private Integer id;
    private Drug drug;
    private Prescription prescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
}
