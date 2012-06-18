package org.openmrs.module.pharm;

import org.openmrs.BaseOpenmrsData;

// CREATE TABLE `pharm_atccode_chemicalcompound` (
//   `atccode_id` int(11) NOT NULL,
//   `chemicalcompound_id` int(11) NOT NULL,
//   KEY `pharm_fk_atccode_chemicalcompound` (`atccode_id`),
//   KEY `pharm_fk_chemicalcompound_atccode` (`chemicalcompound_id`),
//   CONSTRAINT `pharm_fk_atccode_chemicalcompound` FOREIGN KEY (`atccode_id`) REFERENCES `pharm_atccode` (`id`),
//   CONSTRAINT `pharm_fk_chemicalcompound_atccode` FOREIGN KEY (`chemicalcompound_id`) REFERENCES `pharm_chemicalcompound` (`id`)
// ) ENGINE=InnoDB DEFAULT CHARSET=utf8$$
public class AtcCodeChemicalCompound extends BaseOpenmrsData {

    private Integer id;
    private ChemicalCompound chemicalCompound;

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
}
