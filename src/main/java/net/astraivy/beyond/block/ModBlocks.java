package net.astraivy.beyond.block;

import net.astraivy.beyond.Beyond;
import net.astraivy.beyond.block.custom.CosmiliteBlock;
import net.astraivy.beyond.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block COSMILITE_BRICKS = registerBlock("cosmilite_bricks",
            new CosmiliteBlock(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block STATIC_IMITATOR = registerBlock("static_imitator",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.GLASS).luminance(state -> 15)));


    public static final Block CELESTIAL_LOG = registerBlock("celestial_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block CELESTIAL_WOOD = registerBlock("celestial_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_CELESTIAL_LOG = registerBlock("stripped_celestial_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_CELESTIAL_WOOD = registerBlock("stripped_celestial_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));

    public static final Block CELESTIAL_PLANKS = registerBlock("celestial_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block CELESTIAL_LEAVES = registerBlock("celestial_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static final Block CELESTIAL_SAPLING = registerBlock("celestial_sapling",
            new SaplingBlock(ModSaplingGenerators.CELESTIAL_TREE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));


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