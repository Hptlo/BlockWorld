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
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.Random;

public class Test extends InventoryUI implements CommandExecutor, Listener {


//    ######### // 01|02|03|04|05|06|07|08|09
//    ######### // 10|11|12|13|14|15|16|17|18
//    ######### // 19|20|21|22|23|24|25|26|27
//    ######### // 28|29|30|31|32|33|34|35|36
//    ######### // 37|38|39|40|41|42|43|44|45
//    ######### // 46|47|48|49|50|51|52|53|54

    private Integer[] windowSlots;
    private String title;
    private Random r = new Random();


    private void setSlots() {
        windowSlots[0] = 0;
        windowSlots[1] = 1;
        windowSlots[2] = 2;
        windowSlots[3] = 9;
        windowSlots[4] = 10;
        windowSlots[5] = 11;
        windowSlots[6] = 18;
        windowSlots[7] = 19;
        windowSlots[8] = 20;
        windowSlots[9] = 27;
        windowSlots[10] = 28;
        windowSlots[11] = 29;
        windowSlots[12] = 36;
        windowSlots[13] = 37;
        windowSlots[14] = 38;
        windowSlots[15] = 45;
        windowSlots[16] = 46;
        windowSlots[17] = 47;

    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player p = ((Player) commandSender).getPlayer();
            title = "§ctest inventory";
            Inventory inventory = Bukkit.createInventory(p, 6 * 9, title);
            p.openInventory(inventory);
            windowSlots = new Integer[18];
            setSlots();
            
            
            

        }

        return false;
    }

    private void newMap(Player p, Inventory inventory) {
        p.openInventory(inventory);
        for (int i = 0; i < ; i++) {
            
        }
        
        
        
        inventory.setItem(0, Main.itemBuilder.getDye(Material.STAINED_GLASS_PANE, EColor.BLOCK_GREEN));
    }


    @Override
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (e.getInventory().getTitle().equals(title)) {
            e.setCancelled(true);
            switch (e.getSlot()) {
                case 0:
                    newMap((Player) e.getWhoClicked(), e.getInventory());
                    break;
                default:
                    break;
            }
        }
    }
}
