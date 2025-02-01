package net.kubiia.friendsmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.kubiia.friendsmod.block.ModBlocks;
import net.kubiia.friendsmod.effect.ModEffects;
import net.kubiia.friendsmod.item.ModItemGroups;
import net.kubiia.friendsmod.item.ModItems;
import net.kubiia.friendsmod.potion.ModPotions;
import net.kubiia.friendsmod.sound.ModSounds;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FriendsMod implements ModInitializer {
	public static final String MOD_ID = "friendsmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModEffects.registerEffects();
		ModPotions.registerPotions();
		ModSounds.registerSounds();

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, ModItems.KINDER, ModPotions.ILAY_POTION);
		});

		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.SUGAR, ModPotions.DADON_POTION);

		});
		FabricBrewingRecipeRegistryBuilder.BUILD.register(builder -> {
			builder.registerPotionRecipe(Potions.AWKWARD, Items.SUGAR, ModPotions.URI_POTION);

        });
	}
}