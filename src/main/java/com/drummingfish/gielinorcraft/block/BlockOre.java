package com.drummingfish.gielinorcraft.block;

import com.drummingfish.gielinorcraft.item.ItemsGC;
import com.drummingfish.gielinorcraft.tab.GielinorCraftTab;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockOre extends Block {

    static Block currentBlock;

    public BlockOre(String type) {
        super(Material.rock);
        this.setCreativeTab(GielinorCraftTab.GIELINORCRAFT_TAB);
        if (type == "copper") {
            setBlockName(BlockInfo.ORE_COPPER_UNLOCALIZED_NAME);
            setHardness(4.0F);
        }  else if (type == "base") {
            setBlockUnbreakable();
            setBlockName(BlockInfo.ORE_BASE_UNLOCALIZED_NAME);
            setTickRandomly(true);
        } else {
            setBlockName("Unknown Ore!");
        }
    }

    @Override
    public void onBlockAdded(World world, int xCoord, int yCoord, int zCoord) {
        if (this == BlocksGC.oreBase) {
            world.scheduleBlockUpdate(xCoord, yCoord, zCoord, this, this.tickRate(world));
        }
    }

    @Override
    public int tickRate(World world) {
        return 100;
    }

    @Override
    public void updateTick(World world, int xCoord, int yCoord, int zCoord, Random rand) {
        world.setBlock(xCoord, yCoord, zCoord, currentBlock);
    }

    @Override
    public void onBlockDestroyedByPlayer(World world, int xCoord, int yCoord, int zCoord, int metaData) {
        currentBlock = this;
        world.setBlock(xCoord, yCoord, zCoord, BlocksGC.oreBase);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        if (this == BlocksGC.oreBase) {
            blockIcon = register.registerIcon("minecraft" + ":" + "bedrock");
        } else if (this == BlocksGC.oreCopper) {
            blockIcon = register.registerIcon("minecraft" + ":" + "beacon");
        }
    }

    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3) {
        return ItemsGC.oreCopper;
    }

    @Override
    public int quantityDropped(Random par1Random) {
        return 1;
    }

    @Override
    public int quantityDroppedWithBonus(int par1, Random par2Random) {
        if (par1 > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, par2Random, par1)) {
            int j = par2Random.nextInt(par1 + 2) - 1;

            if (j < 0) {
                j = 0;
            }

            return this.quantityDropped(par2Random) * (j + 1);
        } else {
            return this.quantityDropped(par2Random);
        }
    }

    @Override
    public int getExpDrop(IBlockAccess par1World, int par5, int par7) {
        return 0;
    }

    public int damageDropped(int par1)
    {
        return 0;
    }
}
