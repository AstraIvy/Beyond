package net.astraivy.beyond.common.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.astraivy.beyond.common.block.ModBlocks;
import net.astraivy.beyond.common.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COSMILITE_BRICKS);


        blockStateModelGenerator.registerLog(ModBlocks.CELESTIAL_LOG).log(ModBlocks.CELESTIAL_LOG).wood(ModBlocks.CELESTIAL_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CELESTIAL_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.CELESTIAL_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CELESTIAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModBlocks.CELESTIAL_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModItems.ESSENCE, Models.GENERATED);
    }
}
