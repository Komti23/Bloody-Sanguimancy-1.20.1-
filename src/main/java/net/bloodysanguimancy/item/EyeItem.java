
package net.bloodysanguimancy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class EyeItem extends Item {
	public EyeItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(1).saturationMod(0.3f).build()));
	}
}
