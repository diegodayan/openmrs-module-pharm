/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.openmrs.module.pharm;

import java.util.Date;
import java.util.UUID;
import org.junit.Assert;
import org.junit.Test;
import org.openmrs.api.context.Context;
import org.openmrs.test.BaseModuleContextSensitiveTest;

/**
 * Tests the MyModuleService class and all of its methods
 *
 */
public class PharmDrugServiceTest extends BaseModuleContextSensitiveTest {

    /**
     * Make sure that MyService runs fine with a null parameter to
     * getMyModuleObject
     *
     * @throws Exception
     */
    @Test
    public void shouldCreatePharmDrug() throws Exception {
        PharmDrug pDrug = new PharmDrug();
        String uuid = UUID.randomUUID().toString();
        pDrug.setTitle(new Date().toString());
        pDrug.setText("Text for new " + PharmDrug.class.toString());
        pDrug.setPatient(Context.getPatientService().getPatient(Integer.valueOf(2)));
        pDrug.setUuid(uuid);
        Context.getService(PharmDrugService.class).savePharmDrug(pDrug);
        PharmDrug saved = Context.getService(PharmDrugService.class).getPharmDrugByUuid(uuid);
        Assert.assertEquals(pDrug, saved);
        Integer originalId = pDrug.getId();
        Integer savedId = saved.getId();
        Assert.assertEquals(originalId, savedId);
        Context.getService(PharmDrugService.class).deletePharmDrug(saved);
        Assert.assertNull(Context.getService(PharmDrugService.class).getPharmDrug(savedId));
    }
}