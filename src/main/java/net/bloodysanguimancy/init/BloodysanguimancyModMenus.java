
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bloodysanguimancy.init;

import net.bloodysanguimancy.world.inventory.FyyMenu;
import net.bloodysanguimancy.world.inventory.KhranilishchieMenu;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.bloodysanguimancy.BloodysanguimancyMod;

public class BloodysanguimancyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BloodysanguimancyMod.MODID);
	public static final RegistryObject<MenuType<KhranilishchieMenu>> KHRANILISHCHIE = REGISTRY.register("khranilishchie", () -> IForgeMenuType.create(KhranilishchieMenu::new));
	public static final RegistryObject<MenuType<FyyMenu>> FYY = REGISTRY.register("fyy", () -> IForgeMenuType.create(FyyMenu::new));
}
