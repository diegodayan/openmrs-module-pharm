/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.SimpleDomain;
import org.openmrs.module.pharm.SimpleDomainService;
import org.openmrs.module.pharm.db.SimpleDomainDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class SimpleDomainServiceImpl extends BaseOpenmrsService implements SimpleDomainService{
    
        /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private SimpleDomainDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(SimpleDomainDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public SimpleDomain getSimpleDomain(Integer id) {
        return dao.getSimpleDomain(id);
    }

    @Transactional
    public SimpleDomain saveSimpleDomain(SimpleDomain sd) {
        return dao.saveSimpleDomain(sd);
    }
    
}
