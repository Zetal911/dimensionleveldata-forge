package xyz.eclipseisoffline.dimensionleveldata;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(DimensionLevelDataMod.MODID)
public class DimensionLevelDataMod {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "dimensionleveldata";

    public DimensionLevelDataMod(IEventBus modEventBus, ModContainer modContainer) {
    }
}
