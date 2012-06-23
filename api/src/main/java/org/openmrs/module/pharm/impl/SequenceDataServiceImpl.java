/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.SequenceData;
import org.openmrs.module.pharm.SequenceDataService;
import org.openmrs.module.pharm.db.SequenceDataDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Yan
 */
public class SequenceDataServiceImpl extends BaseOpenmrsService implements SequenceDataService {
    
    /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private SequenceDataDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(SequenceDataDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public SequenceData getSequenceData(String sequenceName) {
        return dao.getSequenceData(sequenceName);
    }

    @Transactional
    public SequenceData saveSequenceData(SequenceData sd) {
        return dao.saveSequenceData(sd);
    }    
    
}
