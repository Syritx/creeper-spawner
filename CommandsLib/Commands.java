package CommandsLib;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;

public class Commands implements CommandExecutor {
	
	Main plugin;
	public Commands(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("spawnCreeper").setExecutor(this);
	}
	
	void spawnCreeper(int seconds, Player player) throws Exception {
		while (true) {
			Thread.sleep(seconds*1000);
			
			Location playerLocation = player.getLocation();
			World world = player.getWorld();
			
			world.spawnEntity(playerLocation, EntityType.CREEPER);
		}
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player player = (Player)sender;
		try {
			spawnCreeper(30,player);
		} catch (Exception e) {}
		return false;
	}
}
