/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.Regimen;
import org.openmrs.module.pharm.RegimenService;
import org.openmrs.module.pharm.db.RegimenDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class RegimenServiceImpl extends BaseOpenmrsService implements RegimenService {
    
    /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private RegimenDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(RegimenDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public Regimen getRegimen(Integer id) {
        return dao.getRegimen(id);
    }

    @Transactional
    public Regimen saveRegimen(Regimen regimen) {
        return dao.saveRegimen(regimen);
    }    
    
}
