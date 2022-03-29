package mournfully.strippedlogs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockOldLog;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMultiTexture;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = "sl", name = "StrippedLogs", version = "1.4")
public class StrippedLogs {
	
	public static Block blockStrippedOldLog;
	public static Block blockStrippedNewLog;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		// Item/Block initialization, registration & configuration handling
		
		blockStrippedOldLog = new BlockStrippedOldLog().setBlockName("stripped").setBlockTextureName("stripped").setCreativeTab(CreativeTabs.tabBlock);
		blockStrippedNewLog = new BlockStrippedNewLog().setBlockName("stripped2").setBlockTextureName("stripped").setCreativeTab(CreativeTabs.tabBlock);

		GameRegistry.registerBlock(blockStrippedOldLog, ItemStrippedOldLogs.class, blockStrippedOldLog.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(blockStrippedNewLog, ItemStrippedNewLogs.class, blockStrippedNewLog.getUnlocalizedName().substring(5));

	};
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		// TileEntity, Entity, GUI and Packet registry
	};
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	};
}