
package net.bloodysanguimancy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StrItem extends Item {
	public StrItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
