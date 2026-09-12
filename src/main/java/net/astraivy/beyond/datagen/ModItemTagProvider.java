package net.astraivy.beyond.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.astraivy.beyond.block.ModBlocks;
import net.astraivy.beyond.item.ModItems;
import net.astraivy.beyond.util.ModTags;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.CELESTIAL_LOG.asItem())
                .add(ModBlocks.CELESTIAL_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CELESTIAL_LOG.asItem())
                .add(ModBlocks.STRIPPED_CELESTIAL_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.CELESTIAL_PLANKS.asItem());
    }
}