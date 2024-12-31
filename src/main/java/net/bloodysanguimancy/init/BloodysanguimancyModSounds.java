
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bloodysanguimancy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.bloodysanguimancy.BloodysanguimancyMod;

public class BloodysanguimancyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BloodysanguimancyMod.MODID);
	public static final RegistryObject<SoundEvent> FD = REGISTRY.register("fd", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bloodysanguimancy", "fd")));
}
