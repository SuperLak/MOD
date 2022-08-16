package net.kal.tutorialmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ZIRCON = new ForgeTier(2, 740, 1.5f,
            2f,15, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.ZIRCON.get()));
}