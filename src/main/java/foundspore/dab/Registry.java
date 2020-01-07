package foundspore.dab;

import com.Spore.Biomes.Biomes.*;
import foundspore.dab.config.ConfigManager;
import foundspore.dab.biomes.*;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Registry {

    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registerBiome(registry, new AmplifiedDesert(), "amplified_desert", ConfigManager.amplifieddesert.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.SANDY);
        registerBiome(registry, new AmplifiedJungle(), "amplified_jungle", ConfigManager.amplifiedjungle.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.WET, BiomeDictionary.Type.DENSE);
        registerBiome(registry, new AmplifiedDarkForest(), "amplified_dark_forest", ConfigManager.amplifieddarkforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SPOOKY, BiomeDictionary.Type.DENSE);
        registerBiome(registry, new AmplifiedSnowyTundra(), "amplified_snowy_tundra", ConfigManager.amplfiedsnowytundra.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.COLD, BiomeDictionary.Type.WASTELAND);
        /*registerBiome(registry, new AmplifiedSwamp(), "amplfied_swamp", ConfigManager.amplfiedsnowytundra.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.HOT);*/
        registerBiome(registry, new AmplifiedBadlands(), "amplified_badlands", ConfigManager.amplfiedbandlands.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.MESA, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.SPARSE, BiomeDictionary.Type.SAVANNA);
        registerBiome(registry, new AmplifiedMushroomFields(), "amplified_mushroom_fields", ConfigManager.amplifiedmushroom.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.MUSHROOM, BiomeDictionary.Type.RARE);
        /*registerBiome(registry, new AmplifiedEndHighlands(), "amplified_end_highlands", ConfigManager.amplifiedendhighlands.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.END);*/
        registerBiome(registry, new AmplifiedIceSpikes(), "amplified_ice_spikes", ConfigManager.amplifiedspikes.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.COLD, BiomeDictionary.Type.RARE);
        /*registerBiome(registry, new AmplifiedBadlands(), "amplified_mesa_plateau", ConfigManager.amplifiedmesaplateau.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.MESA);*/
        registerBiome(registry, new AmplifiedGiantTreeTaiga(), "amplified_giant_tree_taiga", ConfigManager.amplifiedgianttreetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.COLD, BiomeDictionary.Type.FOREST);
        registerBiome(registry, new AmplifiedGiantSpruceTaiga(), "amplified_giant_spruce_taiga", ConfigManager.amplifiedgiantsprucetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.FOREST);
        registerBiome(registry, new AmplifiedForest(), "amplified_forest", ConfigManager.amplfiiedforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST);
        /*registerBiome(registry, new AmplifiedBeach(), "amplified_beach", ConfigManager.amplifiedbeach.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.MOUNTAIN);*/
        registerBiome(registry, new AmplifiedBirchForest(), "amplified_birch_forest", ConfigManager.amplifiedbirchforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST);

    }

    private static void registerBiome(IForgeRegistry<Biome> registry, Biome biome, String name, int weight, boolean spawn, BiomeManager.BiomeType type, BiomeDictionary.Type... types) {
        registry.register(biome.setRegistryName(Main.MODID, name));
        if (weight > 0) {
            BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(biome, weight));
            if (spawn) {
                BiomeManager.addSpawnBiome(biome);
            }
            BiomeDictionary.addTypes(biome, types);
        }
    }
}
