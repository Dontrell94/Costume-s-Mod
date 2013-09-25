package costumeMod.common;

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
	
	@EventHandler
    public void First(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
    public void Second(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
    public void Third(FMLPostInitializationEvent event)
	{
		
	}
}