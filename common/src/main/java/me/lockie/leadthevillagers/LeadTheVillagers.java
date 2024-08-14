package me.lockie.leadthevillagers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class LeadTheVillagers {
    public static final String MOD_ID = "leadthevillagers-reborn";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static void init() {
        // Write common init code here.
        LOGGER.info("LeadTheVillagersReborn initialized");
    }
}
