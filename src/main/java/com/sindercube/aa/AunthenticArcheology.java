package com.sindercube.aa;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AunthenticArcheology implements ModInitializer {

    public static final String MOD_ID = "aunthentic_archeology";
    public static final Logger LOGGER = LoggerFactory.getLogger("Aunthentic Archeology");

    public static Identifier of(String path) {
        return Identifier.of(MOD_ID, path);
    }


    @Override
    public void onInitialize() {
        register();
        LOGGER.info("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm egg");
    }


    public void register() {



    }

}
