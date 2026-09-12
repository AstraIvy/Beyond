package net.astraivy.beyond;

import net.astraivy.beyond.particle.ModParticles;
import net.astraivy.beyond.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.astraivy.beyond.block.ModBlocks;
import net.astraivy.beyond.item.ModItemGroups;
import net.astraivy.beyond.item.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
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

		StrippableBlockRegistry.register(ModBlocks.CELESTIAL_LOG, ModBlocks.STRIPPED_CELESTIAL_LOG);
		StrippableBlockRegistry.register(ModBlocks.CELESTIAL_WOOD, ModBlocks.STRIPPED_CELESTIAL_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CELESTIAL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CELESTIAL_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CELESTIAL_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CELESTIAL_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CELESTIAL_PLANKS, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CELESTIAL_LEAVES, 30, 60);


		LOGGER.info("Does Cosmos Exist?");
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}
