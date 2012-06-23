/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Pregnancy;
import org.openmrs.module.pharm.PregnancyService;
import org.openmrs.module.pharm.db.PregnancyDAO;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author Yan
 */
public class PregnancyServiceImpl extends BaseOpenmrsService implements PregnancyService {
    
    /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private PregnancyDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(PregnancyDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public Pregnancy getPregnancy(Integer id) {
        return dao.getPregnancy(id);
    }

    @Transactional
    public Pregnancy savePregnancy(Pregnancy pregnancy) {
        return dao.savePregnancy(pregnancy);
    }    
    
}
