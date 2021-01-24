package io.github.dporth.powertoolplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.github.dporth.powertoolplugin.Main;
import io.github.dporth.powertoolplugin.PowerTool;

public class PowerToolCommands implements CommandExecutor {
	
	private Main plugin;
	
	public PowerToolCommands(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("powertool <tool name>").setExecutor(this);
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command!");
			return true;
		}
		Player player = (Player) sender;
		// Power tool processing
		String toolName = "";
		if (args.length != 0) {
			toolName = args[0];
		}
		// Give user power tool
		PowerTool powerTool = new PowerTool(toolName, player);
		powerTool.provisionTool();
		return false;
	}

}
