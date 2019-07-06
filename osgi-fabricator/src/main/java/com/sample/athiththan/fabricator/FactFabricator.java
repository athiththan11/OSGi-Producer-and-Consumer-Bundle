package com.sample.athiththan.fabricator;

import java.util.logging.Logger;

import com.sample.athiththan.fabricator.model.Fact;

public class FactFabricator {

    private Fact fact = new Fact(System.getProperty("user.name"), System.getProperty("os.name"));
    
    private static final Logger LOGGER = Logger.getLogger(FactFabricator.class.getName());
    
    public Fact getSimpleFact() {
        LOGGER.info("OSGI Fabricator :: Retrieving Simple Fact from FactFabricator Class");
        return fact;
    }

}
