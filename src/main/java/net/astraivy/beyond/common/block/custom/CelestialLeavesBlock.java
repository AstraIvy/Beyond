package net.astraivy.beyond.common.block.custom;

import com.mojang.serialization.MapCodec;
import net.astraivy.beyond.common.particle.ModParticles;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class CelestialLeavesBlock extends LeavesBlock {
    public static final MapCodec<CelestialLeavesBlock> CODEC = createCodec(CelestialLeavesBlock::new);

    public MapCodec<CelestialLeavesBlock> getCodec() {
        return CODEC;
    }

    public CelestialLeavesBlock(AbstractBlock.Settings settings) {
        super(settings);
    }
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(3) == 0) {
            Direction direction = Direction.random(random);
            if (direction != Direction.UP) {
                BlockPos blockPos = pos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos);
                if (!state.isOpaque() || !blockState.isSideSolidFullSquare(world, blockPos, direction.getOpposite())) {
                    double d = direction.getOffsetX() == 0 ? random.nextDouble() : (double)0.5F + (double)direction.getOffsetX() * 0.6;
                    double e = direction.getOffsetY() == 0 ? random.nextDouble() : (double)0.5F + (double)direction.getOffsetY() * 0.6;
                    double f = direction.getOffsetZ() == 0 ? random.nextDouble() : (double)0.5F + (double)direction.getOffsetZ() * 0.6;
                    world.addParticle(ModParticles.CELESTIAL_LEAVES_PARTICLE, (double)pos.getX() + d, (double)pos.getY() + e, (double)pos.getZ() + f, (double)0.0F, (double)0.0F, (double)0.0F);
                }
            }
        }
    }
}