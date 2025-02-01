package net.kubiia.friendsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kubiia.friendsmod.FriendsMod;
import net.kubiia.friendsmod.effect.EffectClass;
import net.kubiia.friendsmod.effect.ModEffects;
import net.kubiia.friendsmod.item.custom.FalafelCannonItem;
import net.kubiia.friendsmod.item.custom.FalafelItem;
import net.kubiia.friendsmod.item.custom.SeferToraItem;
import net.kubiia.friendsmod.sound.ModSounds;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import javax.tools.Tool;

public class ModItems {
    public static final Item FALAFEL_BALL = registerItem("falafel_ball", new Item(new Item.Settings().food(ModFoodComponents.FALAFEL)));
    public static final Item KINDER = registerItem("kinder", new Item(new Item.Settings().food(ModFoodComponents.KINDER)));
    public static final Item GEFILTE_FISH = registerItem("gefilte_fish", new Item(new Item.Settings().food(ModFoodComponents.GEFILTE_FISH)));
    public static final Item METAL_FALAFEL_BALL = registerItem("metal_falafel_ball", new FalafelItem(new Item.Settings()));
    public static final Item SEFER_TORA = registerItem("sefer_tora", new SeferToraItem(ModToolMaterials.KADOSH,
           new Item.Settings().attributeModifiers(SeferToraItem.createAttributeModifiers(ModToolMaterials.KADOSH,
                   0, -2.4f)).maxCount(1)));
    public static final Item FALAFEL_CANNON = registerItem("falafel_cannon", new FalafelCannonItem(new Item.Settings().maxDamage(1000000000)));
    public static final Item ILAY_MUSIC_DISC = registerItem("ilay_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.AH_SHELI_MITHATEN_KEY)
                    .maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FriendsMod.MOD_ID, name), item);
    }

    public static void customFoodAndDrink(FabricItemGroupEntries entries) {
        entries.add(FALAFEL_BALL);
        entries.add(METAL_FALAFEL_BALL);
        entries.add(FALAFEL_CANNON);
        entries.add(KINDER);
        entries.add(GEFILTE_FISH);
    }

    public static void registerModItems() {
        FriendsMod.LOGGER.info("Registering Mod Items For" + FriendsMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::customFoodAndDrink);
    }
}
