package net.astraivy.beyond.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.astraivy.beyond.block.ModBlocks;
import net.astraivy.beyond.item.ModItems;
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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STATIC_IMITATOR);


        blockStateModelGenerator.registerLog(ModBlocks.CELESTIAL_LOG).log(ModBlocks.CELESTIAL_LOG).wood(ModBlocks.CELESTIAL_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CELESTIAL_LOG).log(ModBlocks.STRIPPED_CELESTIAL_LOG).wood(ModBlocks.STRIPPED_CELESTIAL_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CELESTIAL_PLANKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.CELESTIAL_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CELESTIAL_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModBlocks.CELESTIAL_SAPLING.asItem(), Models.GENERATED);
    }
}
