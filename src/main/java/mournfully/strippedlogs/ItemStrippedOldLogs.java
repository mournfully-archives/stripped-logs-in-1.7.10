package mournfully.strippedlogs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemStrippedOldLogs extends ItemBlock {
	
    public static final String[] ArrayLogs = new String[] {"oak", "spruce", "birch", "jungle"};

	public ItemStrippedOldLogs(Block material) {
		super(material);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack){
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= ArrayLogs.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + ArrayLogs[i];
	}
	
	@Override
	public int getMetadata (int meta) {
		return meta;
	}	
}
