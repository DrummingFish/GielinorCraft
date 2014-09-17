package com.drummingfish.gielinorcraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlocksGC {

    public static Block oreBase;
    public static Block oreCopper;

    public static void init() {
        oreBase = new BlockOre("base");
        oreCopper = new BlockOre("copper");

        GameRegistry.registerBlock(oreBase, BlockInfo.ORE_BASE_KEY);
        GameRegistry.registerBlock(oreCopper, BlockInfo.ORE_COPPER_KEY);
    }

    public static void oreRegistration() {
    }
}
