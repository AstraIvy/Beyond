package net.astraivy.beyond.common.util;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import net.fabricmc.api.ModInitializer;

public class ExampleModDamageTypes implements ModInitializer {

	public static final RegistryKey<DamageType> SCYTHE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, Identifier.of("beyond", "scythe"));


	@Override
	public void onInitialize() {
	}
}