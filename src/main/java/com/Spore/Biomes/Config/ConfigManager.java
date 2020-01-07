package com.Spore.Biomes.Config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConfigManager {

    public static List<Config> BIOMES = new ArrayList<>();

    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    public static Config amplifieddesert = new Config("amplifieddesert", 3);
    public static Config amplifiedjungle = new Config("amplifiedjungle", 3);
    public static Config amplifieddarkforest = new Config("amplifieddarkforest", 3);
    public static Config amplfiedsnowytundra = new Config("amplifiedsnowytundra", 3);
    /*public static Config amplifiedswamp = new Config("amplifiedswamp", 10);*/
    public static Config amplfiedbandlands = new Config("amplifiedbadlands", 3);
    public static Config amplifiedmushroom = new Config("amplifiedmushroom", 3);
    /* public static Config amplifiedendhighlands = new Config("amplifiedendhighlands", 10);*/
    public static Config amplifiedspikes = new Config("amplifiedspikes", 10);
    /*public static Config amplifiedmesaplateau = new Config("amplifiedMesa", 10);*/
    public static Config amplifiedgianttreetaiga = new Config("amplifiedgianttreetaiga", 3);
    public static Config amplifiedgiantsprucetaiga = new Config("amplifiedgiantsprucetaiga", 3);
    public static Config amplfiiedforest = new Config("amplifiedforest", 3);
    /*public static Config amplifiedbeach = new Config("amplifiedbeach", 10);*/
    public static Config amplifiedbirchforest = new Config("amplifiedbirchforest", 3);
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
