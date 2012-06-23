/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.StockTake;
import org.openmrs.module.pharm.StockTakeService;
import org.openmrs.module.pharm.db.StockTakeDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class StockTakeServiceImpl extends BaseOpenmrsService implements StockTakeService {
    
        /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private StockTakeDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(StockTakeDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public StockTake getStockTake(Integer id) {
        return dao.getStockTake(id);
    }

    @Transactional
    public StockTake saveStockTake(StockTake st) {
        return dao.saveStockTake(st);
    }
    
}
