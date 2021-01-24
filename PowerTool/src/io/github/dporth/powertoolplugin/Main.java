package io.github.dporth.powertoolplugin;

import org.bukkit.plugin.java.JavaPlugin;

import io.github.dporth.powertoolplugin.commands.PowerToolCommands;

public class Main extends JavaPlugin {

		@Override
		public void onEnable() {
			new PowerToolCommands(this);
		}
}
