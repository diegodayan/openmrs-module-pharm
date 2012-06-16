package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.AtcCodeChemicalCompound;
import org.openmrs.module.pharm.AtcCodeChemicalCompoundService;
import org.openmrs.module.pharm.db.AtcCodeChemicalCompoundDAO;
import org.springframework.transaction.annotation.Transactional;

public class AtcCodeChemicalCompoundServiceImpl extends BaseOpenmrsService implements AtcCodeChemicalCompoundService {

    private AtcCodeChemicalCompoundDAO dao;

    public void setDao(AtcCodeChemicalCompoundDAO dao) {
        this.dao = dao;
    }

    @Transactional(readOnly = true)
    public AtcCodeChemicalCompound getAtcCodeChemicalCompound(Integer id) {
        return dao.getAtcCodeChemicalCompound(id);
    }

    @Transactional
    public AtcCodeChemicalCompound saveAtcCodeChemicalCompound(AtcCodeChemicalCompound atcccc) {
        return dao.saveAtcCodeChemicalCompound(atcccc);
    }
}
