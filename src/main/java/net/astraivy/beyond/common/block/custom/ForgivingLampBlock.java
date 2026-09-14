package net.astraivy.beyond.common.block.custom;

import com.mojang.serialization.MapCodec;
import net.astraivy.beyond.common.particle.ModParticles;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ForgivingLampBlock extends HorizontalFacingBlock {
    public static final MapCodec<ForgivingLampBlock> CODEC = createCodec(ForgivingLampBlock::new);
    public ForgivingLampBlock(Settings settings) {
        super(settings);
    }

    public static final VoxelShape SHAPE = Block.createCuboidShape(3, 0, 3, 13, 16, 13);

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
            Direction direction = Direction.random(random);
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            if (!state.isOpaque() || !blockState.isSideSolidFullSquare(world, blockPos, direction.getOpposite())) {
                double d = direction.getOffsetX() == 0 ? random.nextDouble() : (double) 0.1F + (double) direction.getOffsetX() * 0.1;
                double e = direction.getOffsetY() == 0 ? random.nextDouble() : (double) 0.1F + (double) direction.getOffsetY() * 0.1;
                double f = direction.getOffsetZ() == 0 ? random.nextDouble() : (double) 0.1F + (double) direction.getOffsetZ() * 0.1;
                world.addParticle(ModParticles.FORGIVING_LAMP_LIGHT_PARTICLE, (double) pos.getX() + d, (double) pos.getY() + e, (double) pos.getZ() + f, (double) 0.0F, (double) 0.0F, (double) 0.0F);

            }
    }
    @Override
    protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }
    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
