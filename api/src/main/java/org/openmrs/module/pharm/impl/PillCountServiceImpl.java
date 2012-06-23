/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.PillCount;
import org.openmrs.module.pharm.PillCountService;
import org.openmrs.module.pharm.db.PillCountDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class PillCountServiceImpl extends BaseOpenmrsService implements PillCountService {
    
    /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private PillCountDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(PillCountDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public PillCount getPillCount(Integer id) {
        return dao.getPillCount(id);
    }

    @Transactional
    public PillCount savePillCount(PillCount pc) {
        return dao.savePillCount(pc);
    }    
    
}
