/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.StockLevel;
import org.openmrs.module.pharm.StockLevelService;
import org.openmrs.module.pharm.db.StockLevelDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class StockLevelServiceImpl extends BaseOpenmrsService implements StockLevelService {
    
        /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private StockLevelDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(StockLevelDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public StockLevel getStockLevel(Integer id) {
        return dao.getStockLevel(id);
    }

    @Transactional
    public StockLevel saveStockLevel(StockLevel sl) {
        return dao.saveStockLevel(sl);
    }
    
}
