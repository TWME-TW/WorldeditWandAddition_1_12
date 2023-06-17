package land.builders.worldeditwandaddition_1_12.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;

public class LeftClickListener implements Listener {
    @EventHandler(priority = EventPriority.LOW)
    public void onLeftClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();

        if (player.getOpenInventory().getTopInventory().getType() == InventoryType.CHEST) return;
        if (!event.getAction().equals(Action.LEFT_CLICK_AIR)) return;
        if (event.getItem() == null || !event.getItem().getType().equals(Material.WOOD_AXE)) return;
        if (!player.hasPermission("worldedit.selection.hpos")) return;

        event.setCancelled(true);
        player.performCommand("/hpos1");

    }
}
