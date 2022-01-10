package de.dopebrot.blockworld;

import de.dopebrot.blockworld.command.BlockWorld;
import de.dopebrot.blockworld.command.Test;
import de.dopebrot.dpu.ConfigHelper;
import de.dopebrot.dpu.InventoryHelper;
import de.dopebrot.dpu.ItemBuilder;
import de.dopebrot.dpu.MathHelper;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static InventoryHelper inventoryHelper;
    public static ConfigHelper configHelper;
    public static ItemBuilder itemBuilder;
    public static MathHelper mathHelper;

    @Override
    public void onEnable() {
        System.out.println("BlockWorld Started");
        inventoryHelper = new InventoryHelper();
        configHelper = new ConfigHelper();
        itemBuilder = new ItemBuilder();
        mathHelper = new MathHelper();


        getCommand("blockworld").setExecutor(new BlockWorld(this));
        getCommand("test").setExecutor(new Test());
        Bukkit.getPluginManager().registerEvents(new Test(),this);

    }
}
