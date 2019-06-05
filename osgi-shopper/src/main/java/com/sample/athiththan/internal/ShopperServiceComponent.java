package com.sample.athiththan.internal;

import java.util.logging.Logger;

import com.sample.athiththan.fabricator.FactFabricator;
import com.sample.athiththan.shopper.FactShopper;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

@Component(
    name = "com.sample.athiththan.shopper.internal.service",
    immediate = true
)
public class ShopperServiceComponent {

    private static final Logger LOGGER = Logger.getLogger(ShopperServiceComponent.class.getName());
    private static FactFabricator fabricator;

    @Activate
    protected void activate(ComponentContext context) {
        LOGGER.info("OSGI Shopper :: Shopper bundle is activated");

        FactShopper shopper = new FactShopper();
        shopper.printFacts();
    }

    @Deactivate
    protected void deactivate(ComponentContext context) {
        LOGGER.info("OSGI Shopper :: Shopper bundle is deactivated");
    }

    @Reference(
        name = "com.sample.athiththan.fabricator.internal.service",
        service = FactFabricator.class,
        cardinality = ReferenceCardinality.MANDATORY,
        policy = ReferencePolicy.DYNAMIC,
        unbind = "unsetFactProvider"
    )
    protected void setFactProducer(FactFabricator pfabricator) {
        LOGGER.info("OSGI Shopper :: FactFabricator is set to Shopper bundle");
        fabricator = pfabricator;
    }

    public static FactFabricator getFactProducer() {
        return fabricator;
    }

    protected void unsetFactProvider(FactFabricator fabricator) {
        LOGGER.info("OSGI Shopper :: FactFabricator is unset from Shopper bundle");
        fabricator = null;
    }
}