package net.linkle.wilder_horizons.init;

import net.linkle.wilder_horizons.Main;
import net.linkle.wilder_horizons.fluid.SludgeFluid;
import net.linkle.wilder_horizons.util.IdProvider;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public enum WHFluids implements IdProvider {
    SLUDGE_STILL(new SludgeFluid.Still()),
    SLUDGE_FLOWING(new SludgeFluid.Flowing());

    public static void initialize() {}
    
    public final Fluid fluid;
    public final Identifier id;
    
    WHFluids(Fluid fluid) {
        this.fluid = Registry.register(Registry.FLUID, id = Main.makeId(name().toLowerCase()), fluid);
    }
    
    public FlowableFluid flowable() {
        return (FlowableFluid)fluid;
    }

    @Override
    public Identifier getId() {
        return id;
    }
}
