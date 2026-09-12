package net.astraivy.beyond.item.custom;
import net.astraivy.beyond.particle.ModParticles;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class AstraScythe extends Item {
    /*@Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(!world.isClient) {

            ((ServerWorld) world).spawnParticles(ModParticles.STARDUST_PARTICLE, user.getX(), user.getY() + 1, user.getZ(), 10, 0, 0, 0, 0.15);
            user.getItemCooldownManager().set(this, 20);
        }

        return TypedActionResult.pass(user.getStackInHand(hand));
    }*/

    public AstraScythe(Settings settings) {
        super(settings);
    }


}
