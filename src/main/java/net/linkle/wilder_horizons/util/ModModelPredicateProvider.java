package net.linkle.wilder_horizons.util;

import net.linkle.wilder_horizons.init.init_core.WHTools;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;

public class ModModelPredicateProvider {

    public static void registerModModels() {
        registerBow(WHTools.CHAMPIONS_BOW);
        registerBow(WHTools.BRASIUM_COMPOUND_BOW);
        registerBow(WHTools.AMETHYST_LEVELED_BOW);
    }

    private static void registerBow(ItemConvertible bow) {
        ModelPredicateProviderRegistry.register(bow.asItem(), new Identifier("pull"),
                (stack, world, entity, seed) -> {
                    if (entity == null || entity.getActiveItem() != stack) {
                        return 0.0f;
                    }
                    return (float)(stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0f;
                });

        ModelPredicateProviderRegistry.register(bow.asItem(), new Identifier("pulling"),
                (stack, world, entity, seed) -> entity != null && entity.isUsingItem()
                        && entity.getActiveItem() == stack ? 1.0f : 0.0f);
    }
}
