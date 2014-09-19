package com.drummingfish.gielinorcraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlocksGC {

    public static Block oreBase;
    public static Block oreCopper;
    public static Block oreTin;
    public static Block oreIron;
    public static Block oreSilver;
    public static Block oreCoal;
    public static Block oreGold;
    public static Block oreMithril;
    public static Block oreAdamantite;
    public static Block oreRunite;
    public static Block oreBane;

    public static void init() {
        oreBase = new BlockOre("base");
        oreCopper = new BlockOre("copper");
        oreTin = new BlockOre("tin");
        oreIron = new BlockOre("iron");
        oreSilver = new BlockOre("silver");
        oreCoal = new BlockOre("coal");
        oreGold = new BlockOre("gold");
        oreMithril = new BlockOre("mithril");
        oreAdamantite = new BlockOre("adamantite");
        oreRunite = new BlockOre("runite");
        oreBane = new BlockOre("bane");

        GameRegistry.registerBlock(oreBase, BlockInfo.ORE_BASE_KEY);
        GameRegistry.registerBlock(oreCopper, BlockInfo.ORE_COPPER_KEY);
        GameRegistry.registerBlock(oreTin, BlockInfo.ORE_TIN_KEY);
        GameRegistry.registerBlock(oreIron, BlockInfo.ORE_IRON_KEY);
        GameRegistry.registerBlock(oreSilver, BlockInfo.ORE_SILVER_KEY);
        GameRegistry.registerBlock(oreCoal, BlockInfo.ORE_COAL_KEY);
        GameRegistry.registerBlock(oreGold, BlockInfo.ORE_GOLD_KEY);
        GameRegistry.registerBlock(oreMithril, BlockInfo.ORE_MITHRIL_KEY);
        GameRegistry.registerBlock(oreAdamantite, BlockInfo.ORE_ADAMANTITE_KEY);
        GameRegistry.registerBlock(oreRunite, BlockInfo.ORE_RUNITE_KEY);
        GameRegistry.registerBlock(oreBane, BlockInfo.ORE_BANE_KEY);
    }

    public static void oreRegistration() {
    }
}
