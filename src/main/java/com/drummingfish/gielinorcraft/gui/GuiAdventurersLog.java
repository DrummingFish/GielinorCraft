package com.drummingfish.gielinorcraft.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class GuiAdventurersLog extends GuiScreen {

    public final int xSize = 176;
    public final int ySize = 88;
    ResourceLocation rL = new ResourceLocation("gielinorcraft:textures/gui/adventure_log.png");

    public GuiAdventurersLog(EntityPlayer player) {
    }

    @Override
    public void drawScreen(int x, int y, float f) {
        drawDefaultBackground();

        this.mc.renderEngine.getTexture(rL);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(rL);

        int posX = (this.width - xSize) / 2;
        int posY = (this.height - ySize) / 2;

        drawTexturedModalRect(posX, posY, 0, 0, xSize, ySize);

        super.drawScreen(x, y, f);
    }

    public void initGui() {
        this.buttonList.clear();

        int posX = (this.width - xSize) / 2;
        int posY = (this.height - ySize) / 2;
    }
}
