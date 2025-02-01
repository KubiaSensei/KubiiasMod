package net.kubiia.friendsmod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent KINDER = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 5), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 200, 5), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 200, 5), 1f)
            .build();
    public static final FoodComponent FALAFEL = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();

    public static final FoodComponent GEFILTE_FISH = new FoodComponent.Builder().nutrition(7).saturationModifier(1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200, 100), 0.5f)
            .build();
}
