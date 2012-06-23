/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;


import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.StockAdjustment;
import org.openmrs.module.pharm.StockAdjustmentService;
import org.openmrs.module.pharm.db.StockAdjustmentDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class StockAdjustmentServiceImpl extends BaseOpenmrsService implements StockAdjustmentService {
    
        /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private StockAdjustmentDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(StockAdjustmentDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public StockAdjustment getStockAdjustment(Integer id) {
        return dao.getStockAdjustment(id);
    }

    @Transactional
    public StockAdjustment saveStockAdjustment(StockAdjustment sa) {
        return dao.saveStockAdjustment(sa);
    }
    
}
