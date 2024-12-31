package net.bloodysanguimancy.procedures;

import net.bloodysanguimancy.init.BloodysanguimancyModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class VnxnvxProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteract event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity instanceof Player _plrCldCheck0 && _plrCldCheck0.getCooldowns().isOnCooldown(BloodysanguimancyModItems.DISPOSABLEBLADE.get()))
				&& (sourceentity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BloodysanguimancyModItems.DISPOSABLEBLADE.get())) : false)) {
			if (sourceentity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1)));
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
			if (sourceentity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BloodysanguimancyModItems.DISPOSABLEBLADE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (sourceentity instanceof Player _player)
				_player.getCooldowns().addCooldown(BloodysanguimancyModItems.DISPOSABLEBLADE.get(), 100);
		}
	}
}
