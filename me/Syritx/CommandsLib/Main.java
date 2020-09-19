package me.Syritx.CommandsLib;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	boolean stopped;
	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	void spawnTnt(CommandSender cmd) {
		Player player = (Player)cmd;
		Location location = player.getLocation();
		World world = player.getWorld();
		
		for (int i = 0; i < 200; i++) {
			world.spawnEntity(location,EntityType.PRIMED_TNT);
		}
		return;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (label.equalsIgnoreCase("starttnt")) {
			if (sender instanceof Player) {
				stopped = false;
				spawnTnt(sender);
				return true;
			}
		}
		
		return false;
	}
}
