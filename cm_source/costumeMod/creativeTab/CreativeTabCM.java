package costumeMod.creativeTab;

import costumeMod.Properties.ArmorProperties;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabCM extends CreativeTabs
{
	public CreativeTabCM(String par2Str)
	{
		super(par2Str);
	}
	
	public ItemStack getIconItemStack() {
        return new ItemStack(ArmorProperties.ScarecrowChestplate);
    }

    // sets the title/name for the creative tab
    @Override
    public String getTranslatedTabLabel()
    {
        return "Costume's Mod";
    }
}