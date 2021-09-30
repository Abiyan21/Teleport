package me.abiyan.sethome.commands;


import me.abiyan.sethome.Main;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;


public class HomeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) return true;

        FileConfiguration configuration = Main.getPlugin(Main.class).getConfig();

        if (configuration.contains(((Player) sender).getUniqueId().toString()))
        {
            ((Player) sender).teleport(configuration.getLocation(((Player) sender).getUniqueId().toString()));
            sender.sendMessage("Erfolgreich teleportiert");
        }else {
            sender.sendMessage("Setzen Sie bitte zuerst einen Home ein");
        }
        return false;
    }
}
