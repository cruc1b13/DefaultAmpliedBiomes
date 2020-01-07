package foundspore.dab.config;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    private String name;
    private int weight;
    private BiomeDictionary.Type[] types;

    private ForgeConfigSpec.IntValue configWeight;

    public Config(String name, int weight) {
        this.name = name;
        this.weight = weight;
        //this.types = types;
        ConfigManager.BIOMES.add(this);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return configWeight.get();
    }

    public boolean shouldSpawn() {
        return configWeight.get() != 0;
    }

    public void apply(ForgeConfigSpec.Builder builder) {
        builder.comment(name + " biome generation").push(name + "_biome");
        configWeight = builder.comment("weight of the biome (set to 0 to disable generation)").defineInRange("weight", weight, 0, 256);
        builder.pop();
    }
}
