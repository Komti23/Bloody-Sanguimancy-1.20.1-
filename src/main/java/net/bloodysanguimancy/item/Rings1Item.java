
package net.bloodysanguimancy.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.bloodysanguimancy.procedures.Rings1WhileBaubleIsEquippedTickProcedure;

public class Rings1Item extends Item implements ICurioItem {
	public Rings1Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		Rings1WhileBaubleIsEquippedTickProcedure.execute(slotContext.entity().level(), slotContext.entity());
	}
}
