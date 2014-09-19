package com.drummingfish.gielinorcraft.item;

import com.drummingfish.gielinorcraft.GielinorCraft;
import com.drummingfish.gielinorcraft.tab.GielinorCraftTab;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemAdventurersLog extends Item {

    public ItemAdventurersLog() {
        super();
        this.setUnlocalizedName(ItemInfo.ADVENTURERS_LOG_UNLOCALIZED_NAME);
        this.setCreativeTab(GielinorCraftTab.GIELINORCRAFT_TAB);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote) player.openGui(GielinorCraft.instance, 1, world, (int)player.posX, (int)player.posY, (int)player.posZ);
        return stack;
    }

    @Override
    public void onUpdate(ItemStack item, World world, Entity entity, int integer, boolean bool) {
    }
}
