package costumeMod.common;

import costumeMod.Config.ArmorConfig;
import costumeMod.Properties.ArmorProperties;
import costumeMod.Registers.ItemRegister;
import costumeMod.Registers.LanguageRegister;
import costumeMod.creativeTab.CreativeArmor;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = CostumeMod.ID, name = "Costume's Mod", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class CostumeMod
{
	public static final String ID = "Costume's Mod";
	
	@Instance(ID)
    public static CostumeMod instance;
	
	//Creative Tab
	public static CreativeArmor Tab = new CreativeArmor();
	
	//Config
    public static ArmorConfig Config = new ArmorConfig();

    // Blocks
    public static ItemRegister ItemReg = new ItemRegister();
    
    //Names
    public static LanguageRegister NameReg = new LanguageRegister();
    
    //Recipes
    //public static RecipeRegister RecipeReg = new RecipeRegister();
    
    //Properties
    public static ArmorProperties Props = new ArmorProperties();
	
	@EventHandler
    public void First(FMLPreInitializationEvent event)
	{
		Config.PreInit(event);
	}

	@EventHandler
    public void Second(FMLInitializationEvent event)
	{
		Props.Props();
		ItemReg.registeritems();
        NameReg.registernames();
        //RecipeReg.addRecipes();
        Tab.CreativeProxy();
	}
	
	@EventHandler
    public void Third(FMLPostInitializationEvent event)
	{
		
	}
}