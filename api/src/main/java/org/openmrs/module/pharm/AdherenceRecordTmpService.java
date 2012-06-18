package org.openmrs.module.pharm;

import org.openmrs.api.OpenmrsService;
import org.openmrs.module.pharm.impl.AdherenceRecordTmpServiceImpl;

/**
 * This is the interface for our database interaction with Note objects. The
 * methods in here must be implemented by our {@link NoteServiceImpl} class.
 * <br/> <br/> This class is referenced from
 * /metadata/moduleApplicationContext.xml so that developers can call
 * <code>Context.getService(NoteService.class).saveNote(note)</code> <br/> <br/>
 * We extend {@link OpenmrsService} so that the onStartup and onShutdown methods
 * can be called while our service is being created for the first time
 *
 */
public interface AdherenceRecordTmpService extends OpenmrsService {

    /**
     * This persists our Note object to the database. If {@link Note#getId()} is
     * null, then an "insert" is done. If it is non-null, then a sql update is
     * done by hibernate. <br/> <br/> The "@should" in this javadoc below is an
     * openmrs-specific thing that has to do with unit tests. The content of the
     * @should says what the unit tests should be testing. See {@link NoteServiceTest}
     * for the matching unit test.
     *
     * @param note The {@link Note} object to save in the database.
     * @return The Note that was saved. {@link Note#getId()} will now be filled
     * in if it was null.
     *
     * @should create a note
     */
    public AdherenceRecordTmp saveAdherenceRecordTmp(AdherenceRecordTmp art);

    /**
     * Get a {@link Note} object by primary key id.
     *
     * @param id the primary key integer id to look up on
     * @return the found Note object which matches the row with the given id. If
     * no row with the given id exists, null is returned.
     */
    public AdherenceRecordTmp getAdherenceRecordTmp(Integer id);
}
