package net.astraivy.beyond.common.particle;

import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import org.jetbrains.annotations.Nullable;

public class StardustParticle extends SpriteBillboardParticle {
    public StardustParticle(ClientWorld clientWorld, double x, double y, double z,
                        SpriteProvider spriteProvider, double velocityX, double velocityY, double velocityZ) {
        super(clientWorld, x, y, z, velocityX, velocityY, velocityZ);
        this.velocityMultiplier = 0.9F;
        this.velocityX = velocityX;
        this.velocityY = velocityY;
        this.velocityZ = velocityZ;

        this.scale *= 1.2F;
        this.setSpriteForAge(spriteProvider);
        this.angle = 0f;
        this.prevAngle = 0f;
        this.maxAge = 30 + random.nextInt(42);
        this.collidesWithWorld = false;
        this.red = random.nextInt(128);
        this.green = random.nextInt(128);
        //this.blue = random.nextInt(128);

    }

    private float rotationSpeed = random.nextFloat() * 1.1f;
    @Override
    public void tick() {
        this.prevAngle = this.angle;
        super.tick();

        this.angle += rotationSpeed;
        rotationSpeed -= 0.025f;

        if (rotationSpeed < 0.0f) {
            rotationSpeed = 0.0f;
        }
    }
    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            return new StardustParticle(world, x, y, z, this.spriteProvider, velocityX, velocityY, velocityZ);
        }
    }
}
