package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;
import org.openmrs.Patient;
// CREATE TABLE `pharm_prescription` (
//   `id` int(11) NOT NULL,
//   `clinicalstage` int(11) DEFAULT NULL,
//   `current` char(1) DEFAULT NULL,
//   `date` datetime DEFAULT NULL,
//   `doctor` int(11) DEFAULT NULL,
//   `duration` int(11) DEFAULT NULL,
//   `modified` char(1) DEFAULT NULL,
//   `patient` int(11) NOT NULL,
//   `prescriptionid` varchar(255) DEFAULT NULL,
//   `weight` double DEFAULT NULL,
//   `reasonforupdate` varchar(255) DEFAULT NULL,
//   `notes` varchar(255) DEFAULT NULL,
//   `enddate` datetime DEFAULT NULL,
//   `drugtypes` varchar(20) DEFAULT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_prescription_doctor` (`doctor`),
//   KEY `pharm_prescription_patient` (`patient`),
//   CONSTRAINT `pharm_prescription_doctor` FOREIGN KEY (`doctor`) REFERENCES `pharm_doctor` (`id`),
//   CONSTRAINT `pharm_prescription_patient` FOREIGN KEY (`patient`) REFERENCES `pharm_patient` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class Prescription extends BaseOpenmrsData {

    private Integer id;
    private Integer clinicalStage;
    private String current;
    private Date date;
    private Doctor doctor;
    private Integer duration;
    private String modified;
    private Patient patient;
    private String prescriptionId;
    private double weight;
    private String reasonForUpdate;
    private String notes;
    private Date endDate;
    private String drugTypes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClinicalStage() {
        return clinicalStage;
    }

    public void setClinicalStage(Integer clinicalStage) {
        this.clinicalStage = clinicalStage;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getReasonForUpdate() {
        return reasonForUpdate;
    }

    public void setReasonForUpdate(String reasonForUpdate) {
        this.reasonForUpdate = reasonForUpdate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDrugTypes() {
        return drugTypes;
    }

    public void setDrugTypes(String drugTypes) {
        this.drugTypes = drugTypes;
    }
}
