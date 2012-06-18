/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

// import java.util.Date;
// import java.util.UUID;
import org.junit.Assert;
import org.junit.Test;
import org.openmrs.api.context.Context;
import org.openmrs.test.BaseModuleContextSensitiveTest;

/**
 * Tests the MyModuleService class and all of its methods
 *
 */
public class iDartPortTest extends BaseModuleContextSensitiveTest {

    /**
     * @throws Exception
     */
    @Test
    public void shouldCreateAdherenceRecordTmp() throws Exception {
        // create and save
        AdherenceRecordTmp original = new AdherenceRecordTmp();
        Context.getService(AdherenceRecordTmpService.class).saveAdherenceRecordTmp(original);
        Integer originalId = original.getId();

        // retrieve and compare
        AdherenceRecordTmp retrieved = Context.getService(AdherenceRecordTmpService.class).getAdherenceRecordTmp(originalId);
        Integer retrievedId = retrieved.getId();
        Assert.assertEquals(original, retrieved);
        Assert.assertEquals(originalId, retrievedId);
    }
}