package com.drummingfish.gielinorcraft.world;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.*;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.event.terraingen.TerrainGen;

import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.*;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.RAVINE;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.SCATTERED_FEATURE;

public class ChunkProviderGielinor implements IChunkProvider {

    /** RNG. */
    private Random rand;
    private NoiseGeneratorOctaves field_147431_j;
    private NoiseGeneratorOctaves field_147432_k;
    private NoiseGeneratorOctaves field_147429_l;
    private NoiseGeneratorPerlin field_147430_m;
    /** A NoiseGeneratorOctaves used in generating terrain */
    public NoiseGeneratorOctaves noiseGen5;
    /** A NoiseGeneratorOctaves used in generating terrain */
    public NoiseGeneratorOctaves noiseGen6;
    public NoiseGeneratorOctaves mobSpawnerNoise;
    /** Reference to the World object. */
    private World worldObj;
    /** are map structures going to be generated (e.g. strongholds) */
    private boolean mapFeaturesEnabled = false;
    private WorldType field_147435_p;
    private double[] field_147434_q = null;
    private float[] parabolicField = null;
    private double[] stoneNoise = new double[256];
    private MapGenBase caveGenerator = new MapGenCaves();
    /** Holds Stronghold Generator */
    private MapGenStronghold strongholdGenerator = new MapGenStronghold();
    /** Holds Village Generator */
    private MapGenVillage villageGenerator = new MapGenVillage();
    /** Holds Mineshaft Generator */
    private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
    /** Holds ravine generator */
    private MapGenBase ravineGenerator = new MapGenRavine();
    /** The biomes that are used to generate the chunk */
    private BiomeGenBase[] biomesForGeneration;
    double[] field_147427_d;
    double[] field_147428_e;
    double[] field_147425_f;
    double[] field_147426_g;
    int[][] field_73219_j = new int[32][32];
    private static final String __OBFID = "CL_00000396";

    {
        caveGenerator = TerrainGen.getModdedMapGen(caveGenerator, CAVE);
        strongholdGenerator = (MapGenStronghold) TerrainGen.getModdedMapGen(strongholdGenerator, STRONGHOLD);
        villageGenerator = (MapGenVillage) TerrainGen.getModdedMapGen(villageGenerator, VILLAGE);
        mineshaftGenerator = (MapGenMineshaft) TerrainGen.getModdedMapGen(mineshaftGenerator, MINESHAFT);
        scatteredFeatureGenerator = (MapGenScatteredFeature) TerrainGen.getModdedMapGen(scatteredFeatureGenerator, SCATTERED_FEATURE);
        ravineGenerator = TerrainGen.getModdedMapGen(ravineGenerator, RAVINE);
    }

    public ChunkProviderGielinor(World p_i2006_1_, long p_i2006_2_, boolean p_i2006_4_)
    {
        this.worldObj = p_i2006_1_;
        this.mapFeaturesEnabled = p_i2006_4_;
        this.field_147435_p = p_i2006_1_.getWorldInfo().getTerrainType();
        this.rand = new Random(p_i2006_2_);
        this.field_147431_j = new NoiseGeneratorOctaves(this.rand, 16);
        this.field_147432_k = new NoiseGeneratorOctaves(this.rand, 16);
        this.field_147429_l = new NoiseGeneratorOctaves(this.rand, 8);
        this.field_147430_m = new NoiseGeneratorPerlin(this.rand, 4);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
        this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);
        this.field_147434_q = new double[825];
        this.parabolicField = new float[25];

        for (int j = -2; j <= 2; ++j)
        {
            for (int k = -2; k <= 2; ++k)
            {
                float f = 10.0F / MathHelper.sqrt_float((float) (j * j + k * k) + 0.2F);
                this.parabolicField[j + 2 + (k + 2) * 5] = f;
            }
        }

        NoiseGenerator[] noiseGens = {field_147431_j, field_147432_k, field_147429_l, field_147430_m, noiseGen5, noiseGen6, mobSpawnerNoise};
        noiseGens = TerrainGen.getModdedNoiseGenerators(p_i2006_1_, this.rand, noiseGens);
        this.field_147431_j = (NoiseGeneratorOctaves)noiseGens[0];
        this.field_147432_k = (NoiseGeneratorOctaves)noiseGens[1];
        this.field_147429_l = (NoiseGeneratorOctaves)noiseGens[2];
        this.field_147430_m = (NoiseGeneratorPerlin)noiseGens[3];
        this.noiseGen5 = (NoiseGeneratorOctaves)noiseGens[4];
        this.noiseGen6 = (NoiseGeneratorOctaves)noiseGens[5];
        this.mobSpawnerNoise = (NoiseGeneratorOctaves)noiseGens[6];
    }

    @Override
    public boolean chunkExists(int i, int j) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Chunk provideChunk(int i, int j) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Chunk loadChunk(int i, int j) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void populate(IChunkProvider provider, int i, int j) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean saveChunks(boolean flag, IProgressUpdate update) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean unloadQueuedChunks() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean canSave() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String makeString() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List getPossibleCreatures(EnumCreatureType creatureType, int i, int j, int k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ChunkPosition func_147416_a(World world, String s, int i, int j, int k) {
        return null;
    }

    @Override
    public int getLoadedChunkCount() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void recreateStructures(int i, int j) {
        // TODO Auto-generated method stub

    }

    @Override
    public void saveExtraData() {

    }
}
