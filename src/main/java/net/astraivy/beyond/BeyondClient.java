package net.astraivy.beyond;

import net.astraivy.beyond.block.ModBlocks;
import net.astraivy.beyond.particle.ModParticles;
import net.astraivy.beyond.particle.StardustParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.render.RenderLayer;

public class BeyondClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CELESTIAL_SAPLING, RenderLayer.getCutout());
		ParticleFactoryRegistry.getInstance().register(ModParticles.STARDUST_PARTICLE, StardustParticle.Factory::new);
	}
}
