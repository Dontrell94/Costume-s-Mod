package costumeMod.creativeTab;

import costumeMod.Properties.ArmorProperties;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeArmor
{
	public static Item ScarecrowHelmet;
	public static Item ScarecrowChestplate;
	public static Item ScarecrowLeggings;
	public static Item ScarecrowBoots;
	
	//Creative Tab
    public static CreativeTabs customTab = new CreativeTabCM("Costume's Mod");
    
    public void CreativeProxy()
    {
    	//Creative innards
    	LanguageRegistry.instance().addStringLocalization("Costume's Mod","en_US", "Costume's Mod");
    	ArmorProperties.ScarecrowHelmet.setCreativeTab(CreativeArmor.customTab);
    	ArmorProperties.ScarecrowChestplate.setCreativeTab(CreativeArmor.customTab);
    	ArmorProperties.ScarecrowLeggings.setCreativeTab(CreativeArmor.customTab);
    	ArmorProperties.ScarecrowBoots.setCreativeTab(CreativeArmor.customTab);
    }
}