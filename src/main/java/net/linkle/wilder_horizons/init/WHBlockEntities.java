package net.linkle.wilder_horizons.init;

import java.util.stream.Stream;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder.Factory;
import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.block.entity.*;
import net.linkle.wilder_horizons.enums.BlockEntityEnum;
import net.linkle.wilder_horizons.init.core_inits.WHBlocks;
import net.linkle.wilder_horizons.util.BlockConvertible;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public enum WHBlockEntities implements BlockEntityEnum {

    CRATE(CrateBlockEntity::new, WHBlocks.CRATE),
    DEEPSLATE_CHEST(DeepslateChestBlockEntity::new, WHBlocks.DEEPSLATE_CHEST),
    //COFFIN(CoffinBlockEntity::new, BlocksModded.COFFIN),

    COUNTER(CounterBlockEntity::new, WHBlocks.COUNTER),
    CABINET(CabinetBlockEntity::new, WHBlocks.CABINET),
    STOVE(StoveBlockEntity::new, WHBlocks.BRICK_STOVE);
    //MEMORYBOX(MemoryBoxEntity::new, BlocksModded.MEMORY_BOX);

    public static void initialize() {
    }
    
    @Environment(EnvType.CLIENT)
    public static void initializeClient() {
        
    }
    
    private final BlockEntityType<?> type;
    
    public final Identifier id;
    
    private <T extends BlockEntity> WHBlockEntities(Factory<T> factory, BlockConvertible... blocks) {
        this(factory, Stream.of(blocks).map(BlockConvertible::asBlock).toArray(Block[]::new));
    }
    
    private <T extends BlockEntity> WHBlockEntities(Factory<T> factory, Block... blocks) {
        var entity = FabricBlockEntityTypeBuilder.create(factory, blocks).build();
        type = Registry.register(Registry.BLOCK_ENTITY_TYPE, id = Main.makeId(name().toLowerCase()), entity);
    }

    @Override
    public Identifier getId() {
        return id;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <T extends BlockEntity> BlockEntityType<T> type() {
        return (BlockEntityType<T>) type;
    }
}
