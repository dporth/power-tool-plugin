package io.github.dporth.powertoolplugin;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PowerTool {
	private String toolName;
	private Player player;
	
	public PowerTool(String toolName, Player player) {
		this.toolName = toolName;
		this.player = player;
	}
	
	public void provisionTool() {
		Material tool;
		Map<Enchantment, Integer> enchantments = new HashMap<Enchantment, Integer>();
		switch(this.toolName.toLowerCase()) {
			case "axe":
				tool = Material.DIAMOND_AXE;
				enchantments.put(Enchantment.DIG_SPEED, 10);
				enchantments.put(Enchantment.LOOT_BONUS_BLOCKS, 5);
				enchantments.put(Enchantment.PIERCING, 10);
				break;
			case "pickaxe":
				tool = Material.DIAMOND_PICKAXE;
				enchantments.put(Enchantment.LOOT_BONUS_BLOCKS, 5);
				enchantments.put(Enchantment.DIG_SPEED, 10);
				break;
			case "shovel":
				tool = Material.DIAMOND_SHOVEL;
				enchantments.put(Enchantment.SILK_TOUCH, 10);
				enchantments.put(Enchantment.DIG_SPEED, 10);
				enchantments.put(Enchantment.LOOT_BONUS_BLOCKS, 5);
				break;
			case "rod":
				tool = Material.FISHING_ROD;
				enchantments.put(Enchantment.LURE, 10);
				enchantments.put(Enchantment.LUCK, 10);
				break;
			default:
				tool = Material.DIAMOND_PICKAXE;
				enchantments.put(Enchantment.DIG_SPEED, 10);
				enchantments.put(Enchantment.LOOT_BONUS_BLOCKS, 5);
				break;
		}
		// Default enchantments
		enchantments.put(Enchantment.DURABILITY, 10);
		
		ItemStack itemStack = new ItemStack(tool,1);
		itemStack.addUnsafeEnchantments(enchantments);
        player.getInventory().addItem(itemStack);

	}
}
