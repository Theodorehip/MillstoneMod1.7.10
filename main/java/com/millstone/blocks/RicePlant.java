package com.millstone.blocks;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

import com.millstone.MillstoneItems;


public class RicePlant extends BlockCrops{
	
	
	
	/**
	 * seeds
	 */
	@Override
	protected Item func_149866_i()
    {
        return MillstoneItems.riceCrop;
    }
	
	
	/**
	 * crop
	 */
	@Override
    protected Item func_149865_P()
    {
        return MillstoneItems.riceCrop;
    }
	
	

}
