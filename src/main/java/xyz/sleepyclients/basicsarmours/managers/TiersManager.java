package xyz.sleepyclients.basicsarmours.managers;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TiersManager {
    public static final ForgeTier EMERALD = new ForgeTier(
            4, 1200, -4, 4f, 12, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.EMERALD));
}
