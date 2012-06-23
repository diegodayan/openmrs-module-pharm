/**
 * The contents of this file are subject to the OpenMRS Public License Version
 * 1.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 *
 * Copyright (C) OpenMRS, LLC. All Rights Reserved.
 */
package org.openmrs.module.pharm;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.Activator;
import org.openmrs.module.BaseModuleActivator;
import org.openmrs.module.ModuleActivator;

/**
 * This class contains the logic that is run every time this module is either
 * started or shutdown
 *
 * A module Activator class MUST implement the interface
 * org.openmrs.module.ModuleActivator. Additionally, there is an abstract class
 * org.openmrs.module.BaseModuleActivator that is optionally available as a
 * default implementation and "buffer" against changes. It is recommended to
 * extend the abstract class in your module for "forward compatibility" sake.
 * These are available in version 1.7.0 and later. If you need your module to
 * support earlier versions up to 1.6.x, your activator class should implement
 * the deprecated org.openmrs.module.Activator which has only 2 (two) methods.
 * The class org.openmrs.module.ModuleActivator gives more control to the
 * developer with its 6 (six) methods and so is preferred over the older and
 * simpler Activator interface.
 */
public class PharmActivator extends BaseModuleActivator implements Activator, ModuleActivator {

    private Log log = LogFactory.getLog(this.getClass());

    /**
     * @see org.openmrs.module.Activator#startup()
     */
    public void startup() {
        log.info("Starting Pharm Module");
    }

    /**
     * @see org.openmrs.module.Activator#shutdown()
     */
    public void shutdown() {
        log.info("Shutting down Pharm Module");
    }
}
