package de.dopebrot.blockworld.command;

import de.dopebrot.blockworld.Main;
import de.dopebrot.dpu.EColor;
import de.dopebrot.dpu.InventoryUI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class BlockWorld extends InventoryUI implements CommandExecutor, Listener {

    private Integer taskID;

    private final Main plugin;

    public BlockWorld(Main plugin) {
        this.plugin = plugin;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player p = ((Player) sender).getPlayer();


            // /blockworld start/settings/stop

            switch (args.length) {
                case 1: // /start/stop/help
                    switch (args[0].toLowerCase()) {
                        case "start":
                            // start function
                            start(p);
                            break;
                        case "stop":
                            // stop function
                            start(p);
                            break;
                        case "help":
                            p.sendMessage("----- Commands -----");
                            p.sendMessage("/blockworld settings");
                            p.sendMessage("/blockworld start");
                            p.sendMessage("/blockworld stop");
                            p.sendMessage("/blockworld help");
                            p.sendMessage("--------------------");
                            break;
                        default:
                            p.sendMessage("Command not found /blockworld help");
                            break;
                    }
                    break;
                case 3: // settings setting value
                    break;
                case 4: // settings setting player value?
                    break;
                default:
                    p.sendMessage("Command not found /blockworld help");
                    break;
            }
        }
        return false;
    }


    private int inventory_size;
    private String inventory_title;

    private void start(Player p) {
        Inventory inventory = Bukkit.createInventory(p, inventory_size, inventory_title);
        Main.inventoryHelper.fill(inventory, Main.itemBuilder.getDye(Material.STAINED_GLASS_PANE, EColor.BLOCK_GRAY));


    }


    private void stop(Player p) {

    }


    @Override
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getInventory().getTitle().equals(inventory_title)) {
            e.setCancelled(true);







        }
    }
}
