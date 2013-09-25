package costumeMod.Config;

import costumeMod.Lib.ArmorIDs;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ArmorConfig
{
	//Define properties
	public static int ScarecrowHelmetID;
	public static int ScarecrowChestplateID;
	public static int ScarecrowLeggingsID;
	public static int ScarecrowBootsID;
	
	public void PreInit(FMLPreInitializationEvent event)
    {
        // Configurations
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        ScarecrowHelmetID = config.getItem("Scarecrow Helmet", ArmorIDs.ScarecrowHelmetID).getInt();
        ScarecrowChestplateID = config.getItem("Scarecrow Chestplate", ArmorIDs.ScarecrowChestplateID).getInt();
        ScarecrowLeggingsID = config.getItem("Scarecrow Leggings", ArmorIDs.ScarecrowLeggingsID).getInt();
        ScarecrowBootsID = config.getItem("Scarecrow Boots", ArmorIDs.ScarecrowBootsID).getInt();
        config.save();
    }
}