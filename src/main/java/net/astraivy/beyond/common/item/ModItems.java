package net.astraivy.beyond.common.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.astraivy.beyond.Beyond;
import net.astraivy.beyond.common.item.custom.AstraScythe;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    public static final Item ASTRA_SCYTHE = registerItem("astra_scythe", new AstraScythe(new Item.Settings().rarity(Rarity.EPIC).maxCount(1).attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.ASTRA_SCYTHE, 8, -3f))));
    public static final Item ESSENCE = registerItem("essence", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Beyond.MOD_ID, name), item);
    }
    public static void registerModItems() {
        Beyond.LOGGER.info("Registering Mod Items for Beyond");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}