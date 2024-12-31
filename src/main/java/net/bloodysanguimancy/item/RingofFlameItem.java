
package net.bloodysanguimancy.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.bloodysanguimancy.procedures.RingofFlameWhileBaubleIsEquippedTickProcedure;

public class RingofFlameItem extends Item implements ICurioItem {
	public RingofFlameItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		RingofFlameWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}
}
