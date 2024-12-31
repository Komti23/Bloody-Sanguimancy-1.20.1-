
package net.bloodysanguimancy.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;

import net.bloodysanguimancy.procedures.OborvPriPoluchieniiPriedmietaPoRietsieptuProcedure;

public class OborvItem extends Item {
	public OborvItem() {
		super(new Item.Properties().stacksTo(4).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		OborvPriPoluchieniiPriedmietaPoRietsieptuProcedure.execute(entity);
	}
}
