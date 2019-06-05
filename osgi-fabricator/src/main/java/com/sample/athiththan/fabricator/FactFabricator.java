package com.sample.athiththan.fabricator;

import java.util.logging.Logger;

import com.sample.athiththan.fabricator.model.Fact;

public class FactFabricator {

    private static final Logger LOGGER = Logger.getLogger(FactFabricator.class.getName());

    //#region singleton implementation

    // private static volatile FactFabricator fabricator;

    // private FactFabricator() {}

    // public static FactFabricator getInstance() {

    //     if (fabricator == null) {
    //         synchronized (FactFabricator.class) {
    //             if (fabricator == null) {
    //                 fabricator = new FactFabricator();
    //             }
    //         }
    //     }
    //     return fabricator;
    // }

    //#endregion
    
    public Fact getSimpleFact() {
        LOGGER.info("OSGI Fabricator :: Retrieving Simple Fact from FactFabricator Class");
        return new Fact(System.getProperty("user.name"), System.getProperty("os.name"));
    }

}
