package costumeMod.armor;

import costumeMod.Properties.ArmorProperties;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorScarecrow extends ItemArmor
{
	public ArmorScarecrow(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4)
	{
		super(par1, par2EnumArmorMaterial, par3, par4);
	}

	/**
	*  To Add Armor Texture to Player when worn.
	*/
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer)
		{
		if(itemID == ArmorProperties.ScarecrowHelmet.itemID || itemID == ArmorProperties.ScarecrowChestplate.itemID)
		{
			return "costume's_mod:textures/models/armor/scarecrow_1.png";
		}
		if(itemID == ArmorProperties.ScarecrowLeggings.itemID)
		{
			return "costume's_mod:textures/models/armor/scarecrow_2.png";
		}
		if(itemID == ArmorProperties.ScarecrowBoots.itemID)
		{
			return "costume's_mod:textures/models/armor/scarecrow_2.png";
		}
		else return null;
		}
		/**
		* To Add Armor Texture to Item Armor (when held or in inventory)
		*/
		/*public void registerIcons(IconRegister iconReg) 
		{
		if(itemID == ArmorScarecrow.ScarecrowBoots.itemID)
		{
			itemIcon = iconReg.registerIcon("costumemod:rubyboots");
		}
		else if(itemID == ArmorScarecrow.ScarecrowLeggings.itemID)
		{
				itemIcon = iconReg.registerIcon("costumemod:rubypants");
		}
		else if(itemID == ArmorScarecrow.ScarecrowChestplate.itemID)
		{
				itemIcon = iconReg.registerIcon("costumemod:rubychest");
		}
		else if(itemID == ArmorScarecrow.ScarecrowHelmet.itemID)
		{
			itemIcon = iconReg.registerIcon("costumemod:rubyhelmet");
		}
	}*/
}