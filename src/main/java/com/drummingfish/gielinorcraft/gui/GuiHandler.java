package com.drummingfish.gielinorcraft.gui;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int xCoord, int yCoord, int zCoord) {
        switch (ID) {
            case 1:
                return new DummyContainer();
            default:
                return null;
        }
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int xCoord, int yCoord, int zCoord) {
        switch (ID) {
            case 1:
                return new GuiAdventurersLog(player);
            default:
                return null;
        }
    }
}
