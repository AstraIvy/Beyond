package net.astraivy.beyond.common.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.astraivy.beyond.Beyond;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {
    public static final SimpleParticleType STARDUST_PARTICLE =
            registerParticle("stardust", FabricParticleTypes.simple());
    public static final SimpleParticleType CELESTIAL_LEAVES_PARTICLE =
            registerParticle("celestial_leaves", FabricParticleTypes.simple());
    public static final SimpleParticleType FORGIVING_LAMP_LIGHT_PARTICLE =
            registerParticle("forgiving_lamp", FabricParticleTypes.simple());

    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(Beyond.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        Beyond.LOGGER.info("Registering Particles for Beyond");
    }
}