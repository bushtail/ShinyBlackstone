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
		getLogger().info("Loaded ShinyBlackstone");
		ItemStack gildedBlackstoneItem = new ItemStack(Material.GILDED_BLACKSTONE);
		NamespacedKey gildedBlackstoneKey = new NamespacedKey(this, "gilded_blackstone");
		ShapedRecipe gildedBlackstoneRecipe = new ShapedRecipe(gildedBlackstoneKey, gildedBlackstoneItem);
		gildedBlackstoneRecipe.shape("XXX", "XYX", "XXX");
		gildedBlackstoneRecipe.setIngredient('X', Material.GOLD_NUGGET);
		gildedBlackstoneRecipe.setIngredient('Y', Material.BLACKSTONE);
		Bukkit.addRecipe(gildedBlackstoneRecipe);
	}
	
	@Override
	public void onDisable() {
		
	}
}