package costumeMod.Registers;

import costumeMod.Properties.ArmorProperties;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegister
{
	public void registeritems()
	{
		GameRegistry.registerItem(ArmorProperties.ScarecrowHelmet, "ScarecrowHelmet");
		GameRegistry.registerItem(ArmorProperties.ScarecrowChestplate, "ScarecrowChestplate");
		GameRegistry.registerItem(ArmorProperties.ScarecrowLeggings, "ScarecrowLeggings");
		GameRegistry.registerItem(ArmorProperties.ScarecrowBoots, "ScarecrowBoots");
	}
}