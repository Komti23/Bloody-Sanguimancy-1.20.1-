
package net.bloodysanguimancy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GfItem extends Item {
	public GfItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}