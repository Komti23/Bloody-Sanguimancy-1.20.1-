
package net.bloodysanguimancy.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.bloodysanguimancy.procedures.Test1BaubleIsUnequippedProcedure;
import net.bloodysanguimancy.procedures.Test1BaubleIsEquippedProcedure;

public class Test1Item extends Item implements ICurioItem {
	public Test1Item() {
		super(new Item.Properties().durability(5000).rarity(Rarity.RARE));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		Test1BaubleIsEquippedProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		Test1BaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
