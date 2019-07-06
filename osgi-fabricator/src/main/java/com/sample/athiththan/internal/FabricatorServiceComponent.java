package com.sample.athiththan.internal;

import java.util.logging.Logger;

import com.sample.athiththan.fabricator.FactFabricator;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(name = "com.sample.athiththan.fabricator.internal.service", immediate = true)
public class FabricatorServiceComponent {

    private static final Logger LOGGER = Logger.getLogger(FabricatorServiceComponent.class.getName());

    @Activate
    protected void activate(ComponentContext context) {

        /**
         * create a new instance inside the activate method and register the service
         */

        // create an instance and register
        context.getBundleContext().registerService(FactFabricator.class.getName(), new FactFabricator(), null);

        LOGGER.info("OSGI Fabricator :: Fabricator bundle is activated");
    }

    @Deactivate
    protected void deactivate(ComponentContext context) {
        LOGGER.info("OSGI Fabricator :: Fabricator bundle is deactivated");
    }

}