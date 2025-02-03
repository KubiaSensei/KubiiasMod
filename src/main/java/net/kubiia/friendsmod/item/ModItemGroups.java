package net.kubiia.friendsmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kubiia.friendsmod.FriendsMod;
import net.kubiia.friendsmod.block.ModBlocks;
import net.kubiia.friendsmod.potion.ModPotions;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MAIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FriendsMod.MOD_ID, "main"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.maintab"))
                    .icon(() -> new ItemStack(Items.FIREWORK_ROCKET)).entries((displayContext, entries) -> {
                        // Koren
                        entries.add(ModItems.FALAFEL_BALL);
                        entries.add(ModItems.METAL_FALAFEL_BALL);
                        entries.add(ModBlocks.FALAFEL_BLOCK);
                        entries.add(ModItems.FALAFEL_CANNON);
                        // Ilay
                        entries.add(ModItems.KINDER);
                        entries.add(ModItems.ILAY_MUSIC_DISC);
                        // Shilo
                        entries.add(ModItems.SEFER_TORA);
                        // Uri
                        entries.add(ModItems.GEFILTE_FISH);
                        // Potions
                        entries.add(PotionContentsComponent.createStack(Items.POTION, ModPotions.URI_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.SPLASH_POTION, ModPotions.URI_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.LINGERING_POTION, ModPotions.URI_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.POTION, ModPotions.DADON_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.SPLASH_POTION, ModPotions.DADON_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.LINGERING_POTION, ModPotions.DADON_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.POTION, ModPotions.ILAY_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.SPLASH_POTION, ModPotions.ILAY_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.LINGERING_POTION, ModPotions.ILAY_POTION));
                    }).build());

    public static final ItemGroup KOREN_TAB_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FriendsMod.MOD_ID, "koren"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.korentab"))
                    .icon(() -> new ItemStack(ModItems.FALAFEL_BALL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FALAFEL_BALL);
                        entries.add(ModItems.METAL_FALAFEL_BALL);
                        entries.add(ModBlocks.FALAFEL_BLOCK);
                        entries.add(ModItems.FALAFEL_CANNON);
                    }).build());

    public static final ItemGroup ILAY_TAB_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FriendsMod.MOD_ID, "ilay"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ilaytab"))
                    .icon(() -> new ItemStack(ModItems.KINDER)).entries((displayContext, entries) -> {
                        entries.add(ModItems.KINDER);
                        entries.add(ModItems.ILAY_MUSIC_DISC);
                        entries.add(PotionContentsComponent.createStack(Items.POTION, ModPotions.ILAY_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.SPLASH_POTION, ModPotions.ILAY_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.LINGERING_POTION, ModPotions.ILAY_POTION));
                    }).build());

    public static final ItemGroup DADON_TAB_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FriendsMod.MOD_ID, "dadon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dadontab"))
                    .icon(() -> new ItemStack(Items.STICK)).entries((displayContext, entries) -> {
                        entries.add(PotionContentsComponent.createStack(Items.POTION, ModPotions.DADON_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.SPLASH_POTION, ModPotions.DADON_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.LINGERING_POTION, ModPotions.DADON_POTION));
                    }).build());

    public static final ItemGroup SHILO_TAB_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FriendsMod.MOD_ID, "shilo"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.shilotab"))
                    .icon(() -> new ItemStack(ModItems.SEFER_TORA)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SEFER_TORA);
                    }).build());

    public static final ItemGroup URI_TAB_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FriendsMod.MOD_ID, "uri"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.uritab"))
                    .icon(() -> new ItemStack(ModItems.GEFILTE_FISH)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GEFILTE_FISH);
                        entries.add(PotionContentsComponent.createStack(Items.POTION, ModPotions.URI_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.SPLASH_POTION, ModPotions.URI_POTION));
                        entries.add(PotionContentsComponent.createStack(Items.LINGERING_POTION, ModPotions.URI_POTION));
                    }).build());


    public static void registerItemGroups() {
        FriendsMod.LOGGER.info("Registring Item Groups For" + FriendsMod.MOD_ID);
    }
}
