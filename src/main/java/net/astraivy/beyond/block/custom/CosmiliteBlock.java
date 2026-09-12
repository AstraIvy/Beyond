package net.astraivy.beyond.block.custom;

import com.mojang.serialization.MapCodec;
import net.astraivy.beyond.particle.ModParticles;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CryingObsidianBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class CosmiliteBlock extends Block {
    public static final MapCodec<CryingObsidianBlock> CODEC = createCodec(CryingObsidianBlock::new);

    public MapCodec<CryingObsidianBlock> getCodec() {
        return CODEC;
    }

    public CosmiliteBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = Direction.random(random);
                BlockPos blockPos = pos.offset(direction);
                BlockState blockState = world.getBlockState(blockPos);
                if (!state.isOpaque() || !blockState.isSideSolidFullSquare(world, blockPos, direction.getOpposite())) {
                    double d = direction.getOffsetX() == 0 ? random.nextDouble() : (double)0.5F + (double)direction.getOffsetX() * 0.6;
                    double e = direction.getOffsetY() == 0 ? random.nextDouble() : (double)0.5F + (double)direction.getOffsetY() * 0.6;
                    double f = direction.getOffsetZ() == 0 ? random.nextDouble() : (double)0.5F + (double)direction.getOffsetZ() * 0.6;
                    world.addParticle(ModParticles.STARDUST_PARTICLE, (double)pos.getX() + d, (double)pos.getY() + e, (double)pos.getZ() + f, (double)0.0F, (double)0.0F, (double)0.0F);

            }
        }
    }
}

