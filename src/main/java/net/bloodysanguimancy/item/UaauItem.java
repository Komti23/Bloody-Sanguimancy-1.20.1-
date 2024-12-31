
package net.bloodysanguimancy.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.bloodysanguimancy.procedures.AttackKazhdyiTikVInvientarieProcedure;

public class UaauItem extends Item implements ICurioItem {
	public UaauItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	public void curioTick(SlotContext slotContext, ItemStack stack) {
		AttackKazhdyiTikVInvientarieProcedure.execute(slotContext.entity());
	}
}
