package net.linkle.wilder_horizons.world_modifications;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.linkle.wilder_horizons.Main;
import net.minecraft.util.Identifier;

import static net.minecraft.world.gen.feature.UndergroundPlacedFeatures.MONSTER_ROOM;

public class DungeonRemover {
    public static void init() {
        BiomeModifications.create(new Identifier(Main.ID, "remove_vanilla_dungeons"))
                .add(ModificationPhase.REMOVALS,
                        biomeSelectionContext -> biomeSelectionContext.hasBuiltInPlacedFeature(MONSTER_ROOM.value()),
                        modificationContext -> modificationContext.getGenerationSettings().removeBuiltInFeature(MONSTER_ROOM.value()));
    }
}
