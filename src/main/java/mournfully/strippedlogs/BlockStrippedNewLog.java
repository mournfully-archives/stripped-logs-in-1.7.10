package mournfully.strippedlogs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockStrippedNewLog extends BlockLog {
	public static final String[] ArrayLogs = new String[] {"acacia", "dark_oak"};
    private static final String __OBFID = "CL_00000277";

    /* returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks) */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister){
        this.field_150167_a = new IIcon[ArrayLogs.length];
        this.field_150166_b = new IIcon[ArrayLogs.length];

        for (int i = 0; i < this.field_150167_a.length; ++i){
            this.field_150167_a[i] = iconRegister.registerIcon("sl:" + this.getTextureName() + "_" + ArrayLogs[i] + "_log");
            this.field_150166_b[i] = iconRegister.registerIcon("sl:" + this.getTextureName() + "_" + ArrayLogs[i] + "_log_top");
        }
    }
}
