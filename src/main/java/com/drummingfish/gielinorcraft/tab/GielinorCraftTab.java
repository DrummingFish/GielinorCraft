package com.drummingfish.gielinorcraft.tab;

import com.drummingfish.gielinorcraft.ModInfo;
import com.drummingfish.gielinorcraft.item.ItemsGC;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GielinorCraftTab {

    public static final CreativeTabs GIELINORCRAFT_TAB = new CreativeTabs(ModInfo.ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return ItemsGC.bronzeFullHelm;
        }
    };
}
