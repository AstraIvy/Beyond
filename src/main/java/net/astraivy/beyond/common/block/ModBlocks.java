package net.astraivy.beyond.common.block;

import net.astraivy.beyond.Beyond;
import net.astraivy.beyond.common.block.custom.CelestialLeavesBlock;
import net.astraivy.beyond.common.block.custom.CosmiliteBlock;
import net.astraivy.beyond.common.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COSMILITE_BRICKS = registerBlock("cosmilite_bricks",
            new CosmiliteBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));

    public static final Block CELESTIAL_LOG = registerBlock("celestial_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)));
    public static final Block CELESTIAL_WOOD = registerBlock("celestial_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)));

    public static final Block CELESTIAL_PLANKS = registerBlock("celestial_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.CRIMSON_PLANKS)));
    public static final Block CELESTIAL_LEAVES = registerBlock("celestial_leaves",
            new CelestialLeavesBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES)));

    public static final Block CELESTIAL_SAPLING = registerBlock("celestial_sapling",
            new SaplingBlock(ModSaplingGenerators.CELESTIAL_TREE, AbstractBlock.Settings.copy(Blocks.CHERRY_SAPLING)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Beyond.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Beyond.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks() {
        Beyond.LOGGER.info("Registering Mod Blocks for Beyond");
    }
}