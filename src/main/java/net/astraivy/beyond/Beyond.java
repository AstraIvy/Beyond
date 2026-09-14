package net.astraivy.beyond;

import net.astraivy.beyond.common.particle.ModParticles;
import net.astraivy.beyond.common.util.ModLootTableModifiers;
import net.astraivy.beyond.common.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.astraivy.beyond.common.block.ModBlocks;
import net.astraivy.beyond.common.item.ModItemGroups;
import net.astraivy.beyond.common.item.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Beyond implements ModInitializer {
	public static final String MOD_ID = "beyond";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModParticles.registerParticles();
		ModWorldGeneration.generateModWorldGen();
		ModLootTableModifiers.modifyLootTables();
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CELESTIAL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CELESTIAL_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CELESTIAL_PLANKS, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CELESTIAL_LEAVES, 30, 60);


		LOGGER.info("Does Cosmos Exist?");
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
