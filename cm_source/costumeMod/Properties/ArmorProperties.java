package costumeMod.Properties;

import costumeMod.Config.ArmorConfig;
import costumeMod.armor.*;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.src.ModLoader;
import net.minecraftforge.common.EnumHelper;

public class ArmorProperties
{
	//Define statics
	public static Item ScarecrowHelmet;
	public static Item ScarecrowChestplate;
	public static Item ScarecrowLeggings;
	public static Item ScarecrowBoots;
	
	//Define Enum
	public static EnumArmorMaterial ScarecrowArmor = EnumHelper.addArmorMaterial("LightArmors", 5, new int[]{0, 0, 0, 0}, 15);
	
	//Config establishing
	public static ArmorConfig config = new ArmorConfig();
	
	//Properties
	public void Props()
	{
		ScarecrowHelmet = new ArmorScarecrow(ArmorConfig.ScarecrowHelmetID, ScarecrowArmor, ModLoader.addArmor("Scarecrow"), 0).setUnlocalizedName("Scarecrow Helmet");
		ScarecrowChestplate = new ArmorScarecrow(ArmorConfig.ScarecrowChestplateID, ScarecrowArmor, ModLoader.addArmor("Scarecrow"), 1).setUnlocalizedName("Scarecrow Chestplate");
		ScarecrowLeggings = new ArmorScarecrow(ArmorConfig.ScarecrowLeggingsID, ScarecrowArmor, ModLoader.addArmor("Scarecrow"), 2).setUnlocalizedName("Scarecrow Leggings");
		ScarecrowBoots = new ArmorScarecrow(ArmorConfig.ScarecrowBootsID, ScarecrowArmor, ModLoader.addArmor("Scarecrow"), 3).setUnlocalizedName("Scarecrow Boots");
	}
}