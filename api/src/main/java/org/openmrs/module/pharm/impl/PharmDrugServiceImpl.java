package org.openmrs.module.pharm.impl;

import java.util.List;
import org.openmrs.Patient;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.pharm.PharmDrug;
import org.openmrs.module.pharm.PharmDrugService;
import org.openmrs.module.pharm.db.PharmDrugDAO;
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
public class PharmDrugServiceImpl extends BaseOpenmrsService implements PharmDrugService {

    /**
     * This "dao" object is set by spring. See the
     * /metadata/moduleApplicationContext.xml for what value gets set here. We
     * can assume that this will never be null, even though it never gets set in
     * here. This is called Inversion of Control (IoC)
     */
    private PharmDrugDAO dao;

    /**
     * This is the method that spring calls to set the DAO
     *
     * @param dao the dao to set
     */
    public void setDao(PharmDrugDAO dao) {
        this.dao = dao;
    }

    /**
     * @see
     * org.openmrs.module.patientnotes.NoteService#getNote(java.lang.Integer)
     */
    @Transactional(readOnly = true)
    public PharmDrug getPharmDrug(Integer id) {
        return dao.getPharmDrug(id);
    }

    @Transactional(readOnly = true)
    public PharmDrug getPharmDrugByUuid(String uuid) {
        return dao.getPharmDrugByUuid(uuid);
    }

    @Transactional(readOnly = true)
    public List<PharmDrug> getPharmDrugsByPatient(Patient patient) {
        return dao.getPharmDrugs(patient);
    }

    @Transactional
    public PharmDrug savePharmDrug(PharmDrug pharmDrug) {
        return dao.savePharmDrug(pharmDrug);
    }

    @Transactional
    public PharmDrug deletePharmDrug(PharmDrug pharmDrug) {
        return dao.deletePharmDrug(pharmDrug);
    }
}
