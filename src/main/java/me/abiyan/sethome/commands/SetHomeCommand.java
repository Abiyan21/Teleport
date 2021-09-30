package me.abiyan.sethome.commands;

import me.abiyan.sethome.Main;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;


public class SetHomeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player))
            return true;

            Location location = ((Player) sender).getLocation();

            FileConfiguration configuration = Main.getPlugin(Main.class).getConfig();

            configuration.set(((Player) sender).getUniqueId().toString(), location);
            Main.getPlugin(Main.class).saveConfig();
            sender.sendMessage("Erfolgreich!");

        return false;
    }

}
