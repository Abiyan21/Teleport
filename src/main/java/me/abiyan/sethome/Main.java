package me.abiyan.sethome;

import me.abiyan.sethome.commands.HomeCommand;
import me.abiyan.sethome.commands.SetHomeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("home").setExecutor((new HomeCommand()));
        getCommand("sethome").setExecutor((new SetHomeCommand()));

    }

    @Override
    public void onDisable() {
    }
}
