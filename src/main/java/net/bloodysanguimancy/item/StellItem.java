
package net.bloodysanguimancy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StellItem extends Item {
	public StellItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
