package net.astraivy.beyond.common.item.custom;
import net.minecraft.item.Item;

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
