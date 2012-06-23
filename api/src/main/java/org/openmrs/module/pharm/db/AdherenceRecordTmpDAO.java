/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm.db;

import org.openmrs.module.pharm.AdherenceRecordTmp;
import org.openmrs.module.pharm.AdherenceRecordTmpService;

/**
 * This is the DAO interface. This is never used by the developer, but instead
 * the {@link NoteService} calls it (and developers call the NoteService)
 *
 * @author Diego Dayan
 */
public interface AdherenceRecordTmpDAO {

    AdherenceRecordTmp getAdherenceRecordTmp(Integer id);

    AdherenceRecordTmp saveAdherenceRecordTmp(AdherenceRecordTmp art);
}