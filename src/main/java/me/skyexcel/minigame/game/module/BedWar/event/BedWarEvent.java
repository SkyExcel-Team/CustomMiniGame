package me.skyexcel.minigame.game.module.BedWar.event;

import me.skyexcel.minigame.game.PlayerEvents;
import org.bukkit.Material;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import java.util.ArrayList;
import java.util.List;

public class BedWarEvent extends PlayerEvents {
    private static List<Material> materials = new ArrayList<>();

    static {
        materials.add(Material.WHITE_BED);
        materials.add(Material.RED_BED);
        materials.add(Material.BLUE_BED);
        materials.add(Material.ORANGE_BED);
        materials.add(Material.CYAN_BED);
        materials.add(Material.BLACK_BED);
        materials.add(Material.PINK_BED);
        materials.add(Material.LIME_BED);
        materials.add(Material.GREEN_BED);
        materials.add(Material.WHITE_BED);
        materials.add(Material.LIGHT_BLUE_BED);
        materials.add(Material.LIGHT_GRAY_BED);
    }
    @Override
    public void PlayerJoinEvent(PlayerJoinEvent event) {
        event.setJoinMessage("test");
    }

    @Override
    public void InventoryClickEvent(InventoryClickEvent event) {
        super.InventoryClickEvent(event);
    }

    @Override
    public void BlockBreakEvent(BlockBreakEvent event) {
        super.BlockBreakEvent(event);
    }
}
