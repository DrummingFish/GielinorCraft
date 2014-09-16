package com.drummingfish.gielinorcraft.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void initSounds() {
	}

    @Override
    public void initArmourRenderer(String type) {
        RenderingRegistry.addNewArmourRendererPrefix(type);
    }

    @Override
    public void initRenderers() {
    }

    @Override
    public void initEntities() {
    }
}
