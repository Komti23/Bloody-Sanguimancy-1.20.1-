
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.bloodysanguimancy.init;

import net.bloodysanguimancy.client.gui.FyyScreen;
import net.bloodysanguimancy.client.gui.KhranilishchieScreen;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BloodysanguimancyModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BloodysanguimancyModMenus.KHRANILISHCHIE.get(), KhranilishchieScreen::new);
			MenuScreens.register(BloodysanguimancyModMenus.FYY.get(), FyyScreen::new);
		});
	}
}
