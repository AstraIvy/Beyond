package net.astraivy.beyond.common.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.astraivy.beyond.common.block.ModBlocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CELESTIAL_WOOD)
                .pattern("CC")
                .pattern("CC")
                .input('C', ModBlocks.CELESTIAL_LOG)
                .criterion(hasItem(ModBlocks.CELESTIAL_LOG), conditionsFromItem(ModBlocks.CELESTIAL_LOG))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CELESTIAL_PLANKS, 4)
                .input(ModBlocks.CELESTIAL_LOG)
                .criterion(hasItem(ModBlocks.CELESTIAL_LOG), conditionsFromItem(ModBlocks.CELESTIAL_LOG))
                .offerTo(exporter);;

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK, 4)
                .pattern("C")
                .pattern("C")
                .input('C', ModBlocks.CELESTIAL_PLANKS)
                .criterion(hasItem(ModBlocks.CELESTIAL_LOG), conditionsFromItem(ModBlocks.CELESTIAL_LOG))
                .offerTo(exporter);

    }
}