package net.bear.mymcmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mymcmod implements ModInitializer {
	public static final String MOD_ID = "mymcmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("mymcmod");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}