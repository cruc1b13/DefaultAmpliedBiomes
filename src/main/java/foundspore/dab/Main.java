package foundspore.dab;

import foundspore.dab.config.ConfigManager;
import foundspore.dab.setup.ModSetup;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("dab")
public class Main {
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "dab";

    public static ModSetup setup = new ModSetup();

    public Main() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(setup::init);

        ConfigManager.LoadConfig(ConfigManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MODID + "-common.toml"));
    }
}