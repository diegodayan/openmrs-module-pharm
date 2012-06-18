package org.openmrs.module.pharm;

import java.util.Date;
import org.openmrs.BaseOpenmrsData;
import org.openmrs.Patient;

// CREATE TABLE `pharm_appointment` (
//   `id` int(11) NOT NULL,
//   `appointmentdate` datetime DEFAULT NULL,
//   `patient` int(11) DEFAULT NULL,
//   `visitdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//   PRIMARY KEY (`id`),
//   KEY `pharm_appointment_fkey` (`patient`),
//   CONSTRAINT `pharm_appointment_fkey` FOREIGN KEY (`patient`) REFERENCES `pharm_patient` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class Appointment extends BaseOpenmrsData {

    private Integer id;
    private Date appointmentDate;
    private Date visitDate;
    private Patient patient;

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

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}
