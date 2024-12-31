
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bloodysanguimancy.init;

import net.bloodysanguimancy.client.model.ModelCustomModel;
import net.bloodysanguimancy.client.model.Modelarm;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BloodysanguimancyModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCustomModel.LAYER_LOCATION, ModelCustomModel::createBodyLayer);
		event.registerLayerDefinition(Modelarm.LAYER_LOCATION, Modelarm::createBodyLayer);
	}
}
