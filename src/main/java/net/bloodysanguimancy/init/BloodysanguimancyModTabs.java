
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bloodysanguimancy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.bloodysanguimancy.BloodysanguimancyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BloodysanguimancyModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BloodysanguimancyMod.MODID);
	public static final RegistryObject<CreativeModeTab> ASSASIN = REGISTRY.register("assasin",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.bloodysanguimancy.assasin")).icon(() -> new ItemStack(BloodysanguimancyModItems.DROPOFBLOOD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BloodysanguimancyModItems.BLADEOFBONE.get());
				tabData.accept(BloodysanguimancyModItems.EYE.get());
				tabData.accept(BloodysanguimancyModItems.KUSACHKI.get());
				tabData.accept(BloodysanguimancyModItems.ZOLOTAIA.get());
				tabData.accept(BloodysanguimancyModItems.PROVOLKA.get());
				tabData.accept(BloodysanguimancyModItems.OBORV.get());
				tabData.accept(BloodysanguimancyModItems.KUSACHKIALMAZNYIE.get());
				tabData.accept(BloodysanguimancyModItems.KODTT.get());
				tabData.accept(BloodysanguimancyModItems.GF.get());
				tabData.accept(BloodysanguimancyModItems.SAMA.get());
				tabData.accept(BloodysanguimancyModItems.STR.get());
				tabData.accept(BloodysanguimancyModItems.RUKOIAT.get());
				tabData.accept(BloodysanguimancyModItems.UAAU.get());
				tabData.accept(BloodysanguimancyModItems.SOUND.get());
				tabData.accept(BloodysanguimancyModItems.DROPOFBLOOD.get());
				tabData.accept(BloodysanguimancyModItems.R_ITUALKNIFE.get());
				tabData.accept(BloodysanguimancyModItems.RINGS_1.get());
				tabData.accept(BloodysanguimancyModItems.TEST_1.get());
				tabData.accept(BloodysanguimancyModItems.RINGOF_FLAME.get());
				tabData.accept(BloodysanguimancyModItems.BANT_HELMET.get());
				tabData.accept(BloodysanguimancyModItems.FIREOFBLOOD.get());
				tabData.accept(BloodysanguimancyModItems.DISPOSABLEBLADE.get());
				tabData.accept(BloodysanguimancyModItems.STELL.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(BloodysanguimancyModItems.BANT_HELMET.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(BloodysanguimancyModItems.BLADEOFBONE.get());
		}
	}
}
