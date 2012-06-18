package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.ChemicalDrugStrength;
import org.openmrs.module.pharm.ChemicalDrugStrengthService;
import org.openmrs.module.pharm.db.ChemicalDrugStrengthDAO;
import org.springframework.transaction.annotation.Transactional;

public class ChemicalDrugStrengthServiceImpl extends BaseOpenmrsService implements ChemicalDrugStrengthService {

    private ChemicalDrugStrengthDAO dao;

    public void setDao(ChemicalDrugStrengthDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public ChemicalDrugStrength getChemicalDrugStrength(Integer id) {
        return dao.getChemicalDrugStrength(id);
    }

    @Transactional
    public ChemicalDrugStrength saveChemicalDrugStrength(ChemicalDrugStrength cds) {
        return dao.saveChemicalDrugStrength(cds);
    }
}
