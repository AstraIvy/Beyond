package net.astraivy.beyond;

import net.astraivy.beyond.common.block.ModBlocks;
import net.astraivy.beyond.common.particle.CelestialLeavesParticle;
import net.astraivy.beyond.common.particle.ForgivingLampLightParticle;
import net.astraivy.beyond.common.particle.ModParticles;
import net.astraivy.beyond.common.particle.StardustParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;

public class BeyondClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CELESTIAL_SAPLING, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FORGIVING_LAMP, RenderLayer.getCutout());
		ParticleFactoryRegistry.getInstance().register(ModParticles.STARDUST_PARTICLE, StardustParticle.Factory::new);
		ParticleFactoryRegistry.getInstance().register(ModParticles.CELESTIAL_LEAVES_PARTICLE, CelestialLeavesParticle.Factory::new);
		ParticleFactoryRegistry.getInstance().register(ModParticles.FORGIVING_LAMP_LIGHT_PARTICLE, ForgivingLampLightParticle.Factory::new);
	}
}
