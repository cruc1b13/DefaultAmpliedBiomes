package com.Spore.Biomes.EndBiomes;

/*import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.dimension.EndDimension;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.EndGatewayConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AmplifiedEndHighlands extends Biome {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, SurfaceBuilder.END_STONE_CONFIG);
    static final RainType PRECIPATATION = RainType.NONE;
    static final Category CATEGORY = Category.THEEND;
    static final float DEPTH = 2.3F;
    static final float SCALE = 1.9F;
    static final float TEMPERATURE = 0.5F;
    static final float DOWNFALL = 0.5F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final String PARENT = null;

    public AmplifiedEndHighlands() {
        super(new Builder().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth(DEPTH).waterColor(WATER_COLOR).scale(SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).waterFogColor(WATER_FOG_COLOR).parent(PARENT));
        this.addStructure(Feature.END_CITY, IFeatureConfig.NO_FEATURE_CONFIG);
        this.addFeature(GenerationStage.Decoration.SURFACE_STRUCTURES, createDecoratedFeature(Feature.END_GATEWAY, EndGatewayConfig.func_214702_a(EndDimension.SPAWN, true), Placement.END_GATEWAY, IPlacementConfig.NO_PLACEMENT_CONFIG));
        DefaultBiomeFeatures.func_225489_aq(this);
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(Feature.CHORUS_PLANT, IFeatureConfig.NO_FEATURE_CONFIG, Placement.CHORUS_PLANT, IPlacementConfig.NO_PLACEMENT_CONFIG));
        this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ENDERMAN, 10, 4, 4));
    }

    /**
     * takes temperature, returns color
     */

/*
@OnlyIn(Dist.CLIENT)
    public int getSkyColorByTemp(float currentTemperature) {
        return 0;
    }
}*/