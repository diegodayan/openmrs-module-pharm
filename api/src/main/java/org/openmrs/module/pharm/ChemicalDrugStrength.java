package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_chemicaldrugstrength` (
//   `id` int(4) NOT NULL AUTO_INCREMENT,
//   `chemicalcompound` int(11) NOT NULL,
//   `strength` int(11) DEFAULT NULL,
//   `drug` int(11) NOT NULL,
//   PRIMARY KEY (`id`),
//   KEY `pharm_chemicalcompound_fkey` (`chemicalcompound`),
//   KEY `pharm_drug_fkey1` (`drug`),
//   CONSTRAINT `pharm_chemicalcompound_fkey` FOREIGN KEY (`chemicalcompound`) REFERENCES `pharm_chemicalcompound` (`id`),
//   CONSTRAINT `pharm_drug_fkey1` FOREIGN KEY (`drug`) REFERENCES `pharm_drug` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class ChemicalDrugStrength extends BaseOpenmrsData {

    private Integer id;
    private ChemicalCompound chemicalCompound;
    private Integer strength;
    private Drug drug;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ChemicalCompound getChemicalCompound() {
        return chemicalCompound;
    }

    public void setChemicalCompound(ChemicalCompound chemicalCompound) {
        this.chemicalCompound = chemicalCompound;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
}
