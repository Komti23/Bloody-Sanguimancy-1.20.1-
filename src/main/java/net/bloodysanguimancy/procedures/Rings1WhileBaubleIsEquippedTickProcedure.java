package net.bloodysanguimancy.procedures;

import net.bloodysanguimancy.network.BloodysanguimancyModVariables;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

public class Rings1WhileBaubleIsEquippedTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 1));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 2, 1));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 2, 1));
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u0412\u044B \u0442\u0435\u043F\u0435\u0440\u044C \u0410\u0441\u0441\u0430\u0441\u0438\u043D"), true);
		BloodysanguimancyModVariables.MapVariables.get(world).assasin = 1;
		BloodysanguimancyModVariables.MapVariables.get(world).syncData(world);
	}
}
