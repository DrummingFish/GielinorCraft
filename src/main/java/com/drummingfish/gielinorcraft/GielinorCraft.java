package com.drummingfish.gielinorcraft;

import com.drummingfish.gielinorcraft.block.BlocksGC;
import com.drummingfish.gielinorcraft.config.ConfigHandler;
import com.drummingfish.gielinorcraft.item.ItemsGC;
import com.drummingfish.gielinorcraft.proxy.ClientProxy;
import com.drummingfish.gielinorcraft.utilities.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)

public class GielinorCraft {

    @Mod.Instance(ModInfo.ID)
    public static GielinorCraft instance;

    @SidedProxy(clientSide = "com.drummingfish.gielinorcraft.proxy.ClientProxy", serverSide = "com.drummingfish.gielinorcraft.proxy.CommonProxy")
    public static ClientProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ItemsGC.init();
        BlocksGC.init();

        proxy.initArmourRenderer("BRONZE");
        proxy.initArmourRenderer("IRON");
        proxy.initArmourRenderer("STEEL");
        proxy.initArmourRenderer("INITIATE");
        proxy.initArmourRenderer("BLACK");
        proxy.initArmourRenderer("WHITE");
        proxy.initArmourRenderer("MITHRIL");
        proxy.initArmourRenderer("PROSELYTE");
        proxy.initArmourRenderer("ELITEBLACK");
        proxy.initArmourRenderer("ADAMANT");
        proxy.initArmourRenderer("RUNE");
        proxy.initArmourRenderer("DRAGONSTONE");
        proxy.initArmourRenderer("ROCKSHELL");
        proxy.initArmourRenderer("GRANITE");
        proxy.initArmourRenderer("CORRUPTDRAGON");
        proxy.initArmourRenderer("DRAGON");
        proxy.initArmourRenderer("OBSIDIAN");
        proxy.initArmourRenderer("TAWARRIOR");
        proxy.initArmourRenderer("BARROWS");
        proxy.initArmourRenderer("BANDOS");
        proxy.initArmourRenderer("TORVA");
        proxy.initArmourRenderer("TETSU");
        proxy.initArmourRenderer("BATTLEMAGE");
        proxy.initArmourRenderer("VANGUARD");
        proxy.initArmourRenderer("MALEVOLENT");

        proxy.initArmourRenderer("SOFTLEATHER");
        proxy.initArmourRenderer("HARDLEATHER");
        proxy.initArmourRenderer("STUDDEDLEATHER");
        proxy.initArmourRenderer("FROGLEATHER");
        proxy.initArmourRenderer("CARAPACE");
        proxy.initArmourRenderer("SNAKESKIN");
        proxy.initArmourRenderer("GREENDRAGONHIDE");
        proxy.initArmourRenderer("VOIDKNIGHTRANGED");
        proxy.initArmourRenderer("SPINED");
        proxy.initArmourRenderer("SACREDCLAYRANGED");
        proxy.initArmourRenderer("BLUEDRAGONHIDE");
        proxy.initArmourRenderer("REDDRAGONHIDE");
        proxy.initArmourRenderer("BLACKDRAGONHIDE");
        proxy.initArmourRenderer("BLESSEDDRAGONHIDE");
        proxy.initArmourRenderer("DEMONSLAYER");
        proxy.initArmourRenderer("ROYALDRAGONHIDE");
        proxy.initArmourRenderer("TARANGER");
        proxy.initArmourRenderer("KARIL");
        proxy.initArmourRenderer("ARMADYL");
        proxy.initArmourRenderer("MORRIGAN");
        proxy.initArmourRenderer("PERNIX");
        proxy.initArmourRenderer("DEATHLOTUS");
        proxy.initArmourRenderer("SIRENIC");

        proxy.initArmourRenderer("FIRSTTOWER");
        proxy.initArmourRenderer("ELEMENTAL");
        proxy.initArmourRenderer("WIZARD");
        proxy.initArmourRenderer("MIND");
        proxy.initArmourRenderer("MYCELIUM");
        proxy.initArmourRenderer("IMPHIDE");
        proxy.initArmourRenderer("HEXCREST");
        proxy.initArmourRenderer("COMBATROBES");
        proxy.initArmourRenderer("DRUIDICMMAGE");
        proxy.initArmourRenderer("SPIDERSILK");
        proxy.initArmourRenderer("FUNGAL");
        proxy.initArmourRenderer("MYSTIC");
        proxy.initArmourRenderer("BODY");
        proxy.initArmourRenderer("COSMIC");
        proxy.initArmourRenderer("ENCHANTED");
        proxy.initArmourRenderer("DAGONHAI");
        proxy.initArmourRenderer("NECROMANCER");
        proxy.initArmourRenderer("SPLITBARK");
        proxy.initArmourRenderer("VOIDKNIGHTMAGE");
        proxy.initArmourRenderer("CHAOS");
        proxy.initArmourRenderer("SKELETAL");
        proxy.initArmourRenderer("BATWING");
        proxy.initArmourRenderer("SACREDCLAYMAGE");
        proxy.initArmourRenderer("INFINITY");
        proxy.initArmourRenderer("DRAGONBONE");
        proxy.initArmourRenderer("BATTLE");
        proxy.initArmourRenderer("GRIFOLIC");
        proxy.initArmourRenderer("GOD");
        proxy.initArmourRenderer("LUNAR");
        proxy.initArmourRenderer("TAMAGE");
        proxy.initArmourRenderer("AHRIM");
        proxy.initArmourRenderer("SUBJUGATION");
        proxy.initArmourRenderer("GANODERMIC");
        proxy.initArmourRenderer("ZURIEL");
        proxy.initArmourRenderer("VIRTUS");
        proxy.initArmourRenderer("HYBRID");
        proxy.initArmourRenderer("SEASINGER");
        proxy.initArmourRenderer("TECTONIC");

        LogHelper.info("Pre-Initialization Complete!");
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post-Initialization Complete!");
    }
}
