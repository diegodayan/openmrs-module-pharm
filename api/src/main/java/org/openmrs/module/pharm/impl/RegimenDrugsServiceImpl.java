/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.RegimenDrugs;
import org.openmrs.module.pharm.RegimenDrugsService;
import org.openmrs.module.pharm.db.RegimenDrugsDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class RegimenDrugsServiceImpl extends BaseOpenmrsService implements RegimenDrugsService {
    
    /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private RegimenDrugsDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(RegimenDrugsDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public RegimenDrugs getRegimenDrugs(Integer id) {
        return dao.getRegimenDrugs(id);
    }

    @Transactional
    public RegimenDrugs saveRegimenDrugs(RegimenDrugs rd) {
        return dao.saveRegimenDrugs(rd);
    }    
    
}
