package org.openmrs.module.pharm.impl;

import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.AdherenceRecordTmp;
import org.openmrs.module.pharm.AdherenceRecordTmpService;
import org.openmrs.module.pharm.db.AdherenceRecordTmpDAO;
import org.springframework.transaction.annotation.Transactional;

/**
 * Implementation of our {@link NoteService} interface. This class is set in the
 * /metadata/moduleApplicationContext.xml file to be matched to the
 * {@link NoteService} interface. <br/> <br/> This class extends {@link BaseOpenmrsService}
 * so that there are empty methods for onStartup and onShutdown. This allows
 * sheilds us from changes to the OpenmrsService interface from forcing us to
 * implement the methods. <br/> <br/> NEVER call "new NoteServiceImpl()....". To
 * use this class, you do: <br/>
 * <code>
 *
 *   Context.getService(NoteService.class).saveNote(note)...
 *
 * </code>
 *
 */
public class AdherenceRecordTmpServiceImpl extends BaseOpenmrsService implements AdherenceRecordTmpService {

    /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private AdherenceRecordTmpDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(AdherenceRecordTmpDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public AdherenceRecordTmp getAdherenceRecordTmp(Integer id) {
        return dao.getAdherenceRecordTmp(id);
    }

    @Transactional
    public AdherenceRecordTmp saveAdherenceRecordTmp(AdherenceRecordTmp art) {
        return dao.saveAdherenceRecordTmp(art);
    }
}
