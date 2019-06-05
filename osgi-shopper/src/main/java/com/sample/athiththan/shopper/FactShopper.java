package com.sample.athiththan.shopper;

import java.util.logging.Logger;

import com.sample.athiththan.internal.ShopperServiceComponent;

public class FactShopper {

    private static final Logger LOGGER = Logger.getLogger(FactShopper.class.getName());

    public void printFacts() {
        LOGGER.info("\n\nOSGI Shopper :: Print Facts retrieved from FactFabricator :: "
                + ShopperServiceComponent.getFactProducer().getSimpleFact().toString() + "\n");
    }
}
