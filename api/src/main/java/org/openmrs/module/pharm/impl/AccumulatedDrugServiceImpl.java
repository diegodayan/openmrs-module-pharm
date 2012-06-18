package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.AccumulatedDrug;
import org.openmrs.module.pharm.AccumulatedDrugService;
import org.openmrs.module.pharm.db.AccumulatedDrugDAO;
import org.springframework.transaction.annotation.Transactional;

public class AccumulatedDrugServiceImpl extends BaseOpenmrsService implements AccumulatedDrugService {

    /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private AccumulatedDrugDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(AccumulatedDrugDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public AccumulatedDrug getAccumulatedDrug(Integer id) {
        return dao.getAccumulatedDrug(id);
    }

    @Transactional
    public AccumulatedDrug saveAccumulatedDrug(AccumulatedDrug ad) {
        return dao.saveAccumulatedDrug(ad);
    }
}
