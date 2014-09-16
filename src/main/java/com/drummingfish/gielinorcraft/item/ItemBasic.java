package com.drummingfish.gielinorcraft.item;

import com.drummingfish.gielinorcraft.tab.GielinorCraftTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemBasic extends Item {

    public ItemBasic() {
        super();
        this.setCreativeTab(GielinorCraftTab.GIELINORCRAFT_TAB);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register) {
        //if (this == ItemsGC.) {
        //    itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.);
        //}
    }
}
