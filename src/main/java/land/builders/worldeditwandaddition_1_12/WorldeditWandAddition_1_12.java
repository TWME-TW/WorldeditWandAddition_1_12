package land.builders.worldeditwandaddition_1_12;

import land.builders.worldeditwandaddition_1_12.listeners.LeftClickListener;
import land.builders.worldeditwandaddition_1_12.listeners.RightClickListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class WorldeditWandAddition_1_12 extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new LeftClickListener(),this);
        Bukkit.getServer().getPluginManager().registerEvents(new RightClickListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
