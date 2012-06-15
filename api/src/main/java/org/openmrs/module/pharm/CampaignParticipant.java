package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Patient;

// CREATE TABLE `pharm_campaign_participant` (
//   `campaign_id` int(11) NOT NULL DEFAULT '0',
//   `patient_id` int(11) NOT NULL DEFAULT '0',
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   PRIMARY KEY (`id`),
//   KEY `pharm_campaign_participant_patient_fk` (`patient_id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class CampaignParticipant extends BaseOpenmrsData {

    private Integer id;
    private Patient patient;
    private Campaign campaign;

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

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
}
