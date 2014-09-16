package com.drummingfish.gielinorcraft.item;

import com.drummingfish.gielinorcraft.tab.GielinorCraftTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArmors extends ItemArmor {

	public ItemArmors(ArmorMaterial armourMaterial, int par3, int par4) {
		super(armourMaterial, par3, par4);
		this.setCreativeTab(GielinorCraftTab.GIELINORCRAFT_TAB);
	}
	
//	@Override
//	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
//        if (player != null) {
//            if (this == ItemsGC.) {
//            }
//        } else {
//        }
//    }

//    @Override
//    @SideOnly(Side.CLIENT)
//	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String renderType) {
//		if (this == ItemsGC. || this == ItemsGC. ||this == ItemsGC. || this == ItemsGC.) {
//            if (this.armorType == 2) {
//                return "";
//            } else {
//                return "";
//            }
//        } else {
//            return "";
//        }
//	}

//    @Override
//    @SideOnly(Side.CLIENT)
//	public void registerIcons(IIconRegister register) {
//		if (this == ItemsGC.) {
//			itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.);
//		}
//		if (this == ItemsGC.) {
//            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.);
//		}
//		if (this == ItemsGC.) {
//            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.);
//		}
//		if (this == ItemsGC.) {
//            itemIcon = register.registerIcon(ItemInfo.TEXTURE_LOCATION + ":" + ItemInfo.);
//		}
//	}
}
