package me.skyexcel.minigame.api.event.inventory;

public interface InventoryEvent {
    public default void InventoryEvent(org.bukkit.event.inventory.InventoryEvent event){}
}
