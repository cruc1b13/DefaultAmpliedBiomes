package foundspore.dab.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConfigManager {

    public static List<DABConfig> BIOMES = new ArrayList<>();

    private static ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();


    public static DABConfig amplifiedbadlands = new DABConfig("amplifiedbadlands", 3, 2.3D, 1.9D);
    public static DABConfig amplifiedbamboojungle = new DABConfig("amplifiedjungle", 3, 2.3D, 1.9D);
    public static DABConfig amplifiedbirchforest = new DABConfig("amplifiedbirchforest", 3, 2.3D, 1.9D);
    public static DABConfig amplifieddarkforest = new DABConfig("amplifieddarkforest", 3, 2.3D, 1.9D);
    public static DABConfig amplifieddesert = new DABConfig("amplifieddesert", 3, 2.3D, 1.9D);
    public static DABConfig amplfiiedforest = new DABConfig("amplifiedforest", 3, 2.3D, 1.9D);
    public static DABConfig amplifiedgiantsprucetaiga = new DABConfig("amplifiedgiantsprucetaiga", 3, 2.3D, 1.9D);
    public static DABConfig amplifiedgianttreetaiga = new DABConfig("amplifiedgianttreetaiga", 3, 2.3D, 1.9D);
    public static DABConfig amplifiedicespikes = new DABConfig("amplifiedicespikes", 3, 2.3D, 1.9D);
    public static DABConfig amplifiedjungle = new DABConfig("amplifiedjungle", 3, 2.3D, 1.9D);
    public static DABConfig amplifiedmushroom = new DABConfig("amplifiedmushroom", 3, 2.3D, 1.9D);
    public static DABConfig amplfiedsnowytaiga = new DABConfig("amplifiedsnowytaiga", 3, 2.3D, 1.9D);
    public static DABConfig amplfiedsnowytundra = new DABConfig("amplifiedsnowytundra", 3, 2.3D, 1.9D);
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
