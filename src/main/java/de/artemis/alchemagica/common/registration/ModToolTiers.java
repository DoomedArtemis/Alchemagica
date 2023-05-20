package de.artemis.alchemagica.common.registration;

import de.artemis.alchemagica.Alchemagica;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static Tier ARCANE;

    static {
        ARCANE = TierSortingRegistry.registerTier(
                new ForgeTier(5, 100, 6.0F, 4.0F, 15,
                        ModTags.Block.NEEDS_ARCANE_TOOL, () -> Ingredient.of(ModItems.ARCANE_SHARD.get())),
                new ResourceLocation(Alchemagica.MOD_ID, "arcane"), List.of(Tiers.NETHERITE), List.of());
    }
}