package net.kubiia.friendsmod.effect;

import net.kubiia.friendsmod.FriendsMod;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> FREEZE = registerStatusEffect("freeze",
            new EffectClass(StatusEffectCategory.HARMFUL, 161850780)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                           Identifier.of(FriendsMod.MOD_ID, "freeze"), -10f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> NO_JUMP = registerStatusEffect("no_jump",
            new EffectClass(StatusEffectCategory.HARMFUL, 161850780)
                    .addAttributeModifier(EntityAttributes.GENERIC_GRAVITY,
                            Identifier.of(FriendsMod.MOD_ID, "no_jump"), 100f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> DADON = registerStatusEffect("dadon",
            new EffectClass(StatusEffectCategory.HARMFUL, 1)
                    .addAttributeModifier(EntityAttributes.GENERIC_SCALE,
                            Identifier.of(FriendsMod.MOD_ID, "dadon"), -0.5f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> DADON_HEALTH = registerStatusEffect("dadon_health",
            new EffectClass(StatusEffectCategory.HARMFUL, 1)
                    .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH,
                            Identifier.of(FriendsMod.MOD_ID, "dadon_health"), -0.8f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> DADON_WEAKNESS = registerStatusEffect( "dadon_weakness",
            new EffectClass(StatusEffectCategory.HARMFUL, 1)
                    .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH,
                            Identifier.of(FriendsMod.MOD_ID, "dadon_weakness"), -1f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> ILAY_HEIGHT = registerStatusEffect("ilay_height",
            new EffectClass(StatusEffectCategory.HARMFUL, 1)
                    .addAttributeModifier(EntityAttributes.GENERIC_SCALE,
                            Identifier.of(FriendsMod.MOD_ID, "dadon"), 0.5f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> TZADIK = registerStatusEffect("tzadik",
            new EffectClass(StatusEffectCategory.BENEFICIAL, 1)
                    .addAttributeModifier(EntityAttributes.PLAYER_BLOCK_INTERACTION_RANGE,
                            Identifier.of(FriendsMod.MOD_ID, "tzadik"), 500f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> TZADIK2 = registerStatusEffect("tzadik2",
            new EffectClass(StatusEffectCategory.BENEFICIAL, 1)
                    .addAttributeModifier(EntityAttributes.PLAYER_ENTITY_INTERACTION_RANGE,
                            Identifier.of(FriendsMod.MOD_ID, "tzadik2"), 500f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> URI_HEIGHT = registerStatusEffect("uri_height",
            new EffectClass(StatusEffectCategory.HARMFUL, 1)
                    .addAttributeModifier(EntityAttributes.GENERIC_SCALE,
                            Identifier.of(FriendsMod.MOD_ID, "uri_height"), 0.5f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));






    private static RegistryEntry<StatusEffect> registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(FriendsMod.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        FriendsMod.LOGGER.info("Registering Mod Effects For" + FriendsMod.MOD_ID);
    }
}
