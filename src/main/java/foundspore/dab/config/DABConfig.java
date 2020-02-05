package foundspore.dab.config;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.ForgeConfigSpec;

public class DABConfig {
    private String name;
    private int weight;
    public double scale;
    public double depth;
    //public int villagesize;
    private BiomeDictionary.Type[] types;

    private ForgeConfigSpec.IntValue configWeight;

    public ForgeConfigSpec.DoubleValue configScale;

    public ForgeConfigSpec.DoubleValue configDepth;

    //public ForgeConfigSpec.IntValue configvillagesize;

    public DABConfig(String name, int weight, double scale, double depth) {
        this.name = name;
        this.weight = weight;
        this.scale = scale;
        this.depth = depth;
        //this.villagesize = villagesize;
        //this.types = types;
        ConfigManager.BIOMES.add(this);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return configWeight.get();
    }


    public double getScale() {
        return configScale.get();
    }

    // public int getVillageSize() {
    //     return configvillagesize.get();
    // }

    public double getDepth() {
        return configDepth.get();
    }

    public boolean shouldSpawn() {
        return configWeight.get() != 0;
    }

    public void apply(ForgeConfigSpec.Builder builder) {
        builder.comment(name + " biome generation").push(name + "_biome");
        configScale = builder.comment("scale is height variation. \ndefault is 2.3").defineInRange("scale", scale, 1, 10);
        configDepth = builder.comment("depth describes the height of the biome. \ndefault is 1.9").defineInRange("depth", depth, 1, 10);
        configWeight = builder.comment("weight of the biome (set to 0 to disable generation). \ndefault is 3").defineInRange("weight", weight, 0, 256);
        // configvillagesize = builder.comment("set the size of villages within this biome (set to 0 to disable). \n default is 6").defineInRange("villagesize", villagesize,0,100);
        builder.pop();
    }
}
