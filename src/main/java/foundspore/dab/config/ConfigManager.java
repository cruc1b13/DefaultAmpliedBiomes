package foundspore.dab.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConfigManager {

    public static List<Config> BIOMES = new ArrayList<>();

    private static ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();


    public static Config amplifiedbadlands = new Config("amplifiedbadlands", 3, 2.3D, 1.9D);
    public static Config amplifiedbamboojungle = new Config("amplifiedjungle", 3, 2.3D, 1.9D);
    public static Config amplifiedbirchforest = new Config("amplifiedbirchforest", 3, 2.3D, 1.9D);
    public static Config amplifieddarkforest = new Config("amplifieddarkforest", 3, 2.3D, 1.9D);
    public static Config amplifieddesert = new Config("amplifieddesert", 3, 2.3D, 1.9D);
    public static Config amplfiiedforest = new Config("amplifiedforest", 3, 2.3D, 1.9D);
    public static Config amplifiedgiantsprucetaiga = new Config("amplifiedgiantsprucetaiga", 3, 2.3D, 1.9D);
    public static Config amplifiedgianttreetaiga = new Config("amplifiedgianttreetaiga", 3, 2.3D, 1.9D);
    public static Config amplifiedicespikes = new Config("amplifiedicespikes", 3, 2.3D, 1.9D);
    public static Config amplifiedjungle = new Config("amplifiedjungle", 3, 2.3D, 1.9D);
    public static Config amplifiedmushroom = new Config("amplifiedmushroom", 3, 2.3D, 1.9D);
    public static Config amplifiedtaiga = new Config("amplifiedtaiga", 3, 2.3D, 1.9D);
    public static Config amplfiedsnowytundra = new Config("amplifiedsnowytundra", 3, 2.3D, 1.9D);
    /*public static Config amplifiedswamp = new Config("amplifiedswamp", 10);*/
    /* public static Config amplifiedendhighlands = new Config("amplifiedendhighlands", 10);*/
    /*public static Config amplifiedmesaplateau = new Config("amplifiedMesa", 10);*/
    /*public static Config amplifiedbeach = new Config("amplifiedbeach", 10);*/
    public static ForgeConfigSpec COMMON_CONFIG;

    static {
        BIOMES.forEach(o -> o.apply(COMMON_BUILDER));
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    public static void LoadConfig(ForgeConfigSpec spec, Path path) {
        CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        configData.load();
        spec.setConfig(configData);
    }
}
