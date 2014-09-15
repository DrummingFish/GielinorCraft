package com.drummingfish.gielinorcraft;

import com.drummingfish.gielinorcraft.config.ConfigHandler;
import com.drummingfish.gielinorcraft.proxy.ClientProxy;
import com.drummingfish.gielinorcraft.utilities.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

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
