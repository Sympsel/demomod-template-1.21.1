package com.system.demomod;

import com.system.demomod.block.ModBlocks;
import com.system.demomod.item.ModItemGroups;
import com.system.demomod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoMod implements ModInitializer {
	public static final String MOD_ID = "demomod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerModItemGroups();
		LOGGER.info("Hello Fabric world!");

		// D:\Code\mod_develop\demo1\demomod-template-1.21.1\run\mods
	}
}