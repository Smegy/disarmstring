
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.disarmstring.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.disarmstring.item.DisarmerItem;
import net.mcreator.disarmstring.DisarmstringMod;

public class DisarmstringModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DisarmstringMod.MODID);
	public static final RegistryObject<Item> DISARMER = REGISTRY.register("disarmer", () -> new DisarmerItem());
	// Start of user code block custom items
	// End of user code block custom items
}
