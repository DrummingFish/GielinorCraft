package com.drummingfish.gielinorcraft.world;

import com.drummingfish.gielinorcraft.GielinorCraft;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderGielinor extends WorldProvider
{
    public void registerWorldChunkManager()
    {
        this.worldChunkMgr = new WorldChunkManagerHell(BiomeGenBase.desertHills, 0.8F);
        this.dimensionId = GielinorCraft.dimensionId;
    }

    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderGielinor(worldObj, worldObj.getSeed(), true);
    }

    @Override
    public String getDimensionName()
    {
        return "Gielinor";
    }
}
