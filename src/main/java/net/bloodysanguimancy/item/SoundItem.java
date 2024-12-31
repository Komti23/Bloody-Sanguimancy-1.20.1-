
package net.bloodysanguimancy.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class SoundItem extends RecordItem {
	public SoundItem() {
		super(2, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bloodysanguimancy:fd")), new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 600);
	}
}
