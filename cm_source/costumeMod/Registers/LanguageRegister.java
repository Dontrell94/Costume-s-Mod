package costumeMod.Registers;

import costumeMod.Properties.ArmorProperties;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class LanguageRegister
{
	public void registernames()
	{
		LanguageRegistry.addName(ArmorProperties.ScarecrowHelmet, "Scarecrow Helmet");
		LanguageRegistry.addName(ArmorProperties.ScarecrowChestplate, "Scarecrow Chestplate");
		LanguageRegistry.addName(ArmorProperties.ScarecrowLeggings, "Scarecrow Leggings");
		LanguageRegistry.addName(ArmorProperties.ScarecrowBoots, "Scarecrow Boots");
	}
}