package net.kubiia.friendsmod.potion;

import net.kubiia.friendsmod.FriendsMod;
import net.kubiia.friendsmod.effect.EffectClass;
import net.kubiia.friendsmod.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class ModPotions {
        public static final RegistryEntry<Potion> ILAY_POTION = registerPotion("ilay_potion",
                new Potion(new StatusEffectInstance(ModEffects.NO_JUMP, 200, 0),
                        new StatusEffectInstance(ModEffects.FREEZE, 200, 0),
                        new StatusEffectInstance(ModEffects.ILAY_HEIGHT, 200, 0)));

    public static final RegistryEntry<Potion> DADON_POTION = registerPotion("dadon_potion",
            new Potion(new StatusEffectInstance(ModEffects.DADON, 200, 0),
            new StatusEffectInstance(ModEffects.DADON_WEAKNESS, 200, 0),
            new StatusEffectInstance(ModEffects.DADON_HEALTH, 200, 0),
            new StatusEffectInstance(StatusEffects.REGENERATION, 220, 100)));

    public static final RegistryEntry<Potion> URI_POTION = registerPotion("uri_potion",
            new Potion(new StatusEffectInstance(StatusEffects.GLOWING, 200, 10),
            new StatusEffectInstance(ModEffects.URI_HEIGHT, 200, 10)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(FriendsMod.MOD_ID, name), potion);
    }

    public static void registerPotions() {
        FriendsMod.LOGGER.info("Registering Potions For" + FriendsMod.MOD_ID);
    }
}
