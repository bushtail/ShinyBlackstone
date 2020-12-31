package ca.evannosich.ShinyBlackstone;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class ShinyBlackstone extends JavaPlugin {
	
	@Override
	public void onEnable() {
		ItemStack gildedBlackstoneItem = new ItemStack(Material.GILDED_BLACKSTONE);
		ShapedRecipe gildedBlackstoneRecipe = new ShapedRecipe(gildedBlackstone);
		gildedBlackstone.shape("XXX","XYX", "XXX");
		gildedBlackstone.setIngredient("X", Material.GOLD_NUGGET);
		gildedBlackstone.setIngredient("Y", Material.BLACKSTONE);
		getServer().addRecipe(gildedBlackstoneRecipe);
	}
	
	@Override
	public void onDisable() {
		
	}
}