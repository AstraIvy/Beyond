package net.astraivy.beyond.common.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.astraivy.beyond.Beyond;
import net.astraivy.beyond.common.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BEYOND_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Beyond.MOD_ID, "beyond_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ASTRA_SCYTHE))
                    .displayName(Text.translatable("itemgroup.beyond.beyond"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ASTRA_SCYTHE);
                        entries.add(ModItems.ESSENCE);
                        entries.add(ModBlocks.COSMILITE_BRICKS);

                        entries.add(ModBlocks.CELESTIAL_LOG);
                        entries.add(ModBlocks.CELESTIAL_WOOD);
                        entries.add(ModBlocks.CELESTIAL_PLANKS);
                        entries.add(ModBlocks.CELESTIAL_LEAVES);
                        entries.add(ModBlocks.CELESTIAL_SAPLING);
                        entries.add(ModBlocks.FORGIVING_LAMP);
                    }).build());


    public static void registerItemGroups() {
        Beyond.LOGGER.info("Registering Item Groups for Beyond");
    }
}