package net.astraivy.beyond.world.tree;

import net.astraivy.beyond.Beyond;
import net.astraivy.beyond.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator CELESTIAL_TREE = new SaplingGenerator(Beyond.MOD_ID + ":celestial_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CELESTIAL_TREE_KEY), Optional.empty());
}