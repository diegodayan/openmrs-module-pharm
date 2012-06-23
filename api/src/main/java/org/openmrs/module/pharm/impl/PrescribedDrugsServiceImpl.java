/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.PrescribedDrugs;
import org.openmrs.module.pharm.PrescribedDrugsService;
import org.openmrs.module.pharm.db.PrescribedDrugsDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class PrescribedDrugsServiceImpl extends BaseOpenmrsService implements PrescribedDrugsService {
    
    /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private PrescribedDrugsDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(PrescribedDrugsDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public PrescribedDrugs getPrescribedDrugs(Integer id) {
        return dao.getPrescribedDrugs(id);
    }

    @Transactional
    public PrescribedDrugs savePrescribedDrugs(PrescribedDrugs pd) {
        return dao.savePrescribedDrugs(pd);
    }
    
}
