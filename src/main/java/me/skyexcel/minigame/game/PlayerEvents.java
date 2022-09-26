package me.skyexcel.minigame.game;

import me.skyexcel.minigame.MiniGame;
import me.skyexcel.minigame.event.block.*;

import me.skyexcel.minigame.event.player.bed.PlayerBedEnterEvent;
import me.skyexcel.minigame.event.player.bed.PlayerBedLeaveEvent;
import me.skyexcel.minigame.event.player.*;
import me.skyexcel.minigame.event.player.buket.*;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

/**
 * Include every event from spigot for Mini Game,
 */
public abstract class PlayerEvents implements
        PlayerJoinEvent,
        PlayerQuitEvent,
        PlayerBedEnterEvent,
        PlayerBedLeaveEvent,
        PlayerBucketEmptyEvent,
        PlayerBucketEntityEvent,
        PlayerBucketFillEvent,
        PlayerBucketFishEvent,
        AsyncPlayerChatEvent,
        AsyncPlayerChatPreviewEvent,
        AsyncPlayerPreLoginEvent,
        PlayerAdvancementDoneEvent,
        PlayerArmorStandManipulateEvent,
        PlayerChangedWorldEvent,
        PlayerChannelEvent,
        PlayerChatEvent,
        PlayerChatTabCompleteEvent,
        PlayerCommandPreprocessEvent,
        PlayerCommandSendEvent,
        PlayerDropItemEvent,
        PlayerEditBookEvent,
        PlayerInteractEvent,
        PlayerMoveEvent,
        PlayerExpChangeEvent,
        PlayerFishEvent,
        PlayerGameModeChangeEvent,
        PlayerHideEntityEvent,
        PlayerInteractAtEntityEvent,
        PlayerInteractEntityEvent,
        PlayerItemBreakEvent,
        PlayerItemConsumeEvent,
        PlayerItemDamageEvent,
        PlayerItemHeldEvent,
        PlayerItemMendEvent,
        PlayerKickEvent,
        PlayerLevelChangeEvent,
        PlayerLocaleChangeEvent,
        PlayerLoginEvent,
        PlayerPickupArrowEvent,
        PlayerPickupItemEvent,
        PlayerPortalEvent,
        PlayerPreLoginEvent,
        PlayerRecipeDiscoverEvent,
        PlayerRegisterChannelEvent,
        PlayerResourcePackStatusEvent,
        PlayerRespawnEvent,
        PlayerRiptideEvent,
        PlayerShearEntityEvent,
        PlayerShowEntityEvent,
        PlayerStatisticIncrementEvent,
        PlayerSwapHandItemsEvent,
        PlayerTakeLecternBookEvent,
        PlayerTeleportEvent,
        PlayerToggleFlightEvent,
        PlayerToggleSneakEvent,
        PlayerToggleSprintEvent,
        PlayerUnleashEntityEvent,
        PlayerUnregisterChannelEvent,
        PlayerVelocityEvent,
        BlockBreakEvent,
        BlockBurnEvent,
        BlockCanBuildEvent,
        BlockCookEvent,
        BlockDamageAbortEvent,
        BlockDamageEvent,
        BlockDispenseEvent,
        BlockDropItemEvent,
        BlockExpEvent,
        BlockExplodeEvent,
        BlockFadeEvent,
        BlockDispenseArmorEvent,
        BlockFertilizeEvent,
        BlockFormEvent,
        BlockGrowEvent,
        BlockIgniteEvent,

        BlockPhysicsEvent,
        BlockPistonExtendEvent,
        BlockPistonRetractEvent,
        BlockPlaceEvent,
        BlockReceiveGameEvent,
        BlockRedstoneEvent,
        BlockShearEntityEvent,
        CauldronLevelChangeEvent,

        FluidLevelChangeEvent,
        LeavesDecayEvent,
        MoistureChangeEvent,
        NotePlayEvent,
        BlockSpreadEvent,
        SpongeAbsorbEvent,
        SignChangeEvent,

        Listener {
    public PlayerEvents() {
        Bukkit.getServer().getPluginManager().registerEvents(this, MiniGame.plugin);
    }


    @EventHandler
    public void onJoin(org.bukkit.event.player.PlayerJoinEvent event) {
        PlayerJoinEvent(event);
    }

    @EventHandler
    public void onQuit(org.bukkit.event.player.PlayerQuitEvent event) {
        PlayerQuitEvent(event);
    }

    @EventHandler
    public void onPlayerBedEnterEvent(org.bukkit.event.player.PlayerBedEnterEvent event) {
        PlayerBedEnterEvent(event);
    }

    @EventHandler
    public void onPlayerBedLeaveEvent(org.bukkit.event.player.PlayerBedLeaveEvent event) {
        PlayerBedLeaveEvent(event);
    }

    @EventHandler
    public void onPlayerBucketEmptyEvent(org.bukkit.event.player.PlayerBucketEmptyEvent event) {
        PlayerBucketEmptyEvent(event);
    }

    @EventHandler
    public void onPlayerBucketEntityEvent(org.bukkit.event.player.PlayerBucketEntityEvent event) {
        PlayerBucketEntityEvent(event);
    }

    @EventHandler
    public void onPlayerBucketFillEvent(org.bukkit.event.player.PlayerBucketFillEvent event) {
        PlayerBucketFillEvent(event);
    }

    @EventHandler
    public void onPlayerBucketFishEvent(org.bukkit.event.player.PlayerBucketFishEvent event) {
        PlayerBucketFishEvent(event);
    }

    @EventHandler
    public void onAsyncPlayerChatEvent(org.bukkit.event.player.AsyncPlayerChatEvent event) {
        AsyncPlayerChatEvent(event);
    }

    @EventHandler
    public void onAsyncPlayerChatPreviewEvent(org.bukkit.event.player.AsyncPlayerChatPreviewEvent event) {
        AsyncPlayerChatPreviewEvent(event);
    }

    @EventHandler
    public void onAsyncPlayerPreLoginEvent(org.bukkit.event.player.AsyncPlayerPreLoginEvent event) {
        AsyncPlayerPreLoginEvent(event);
    }

    @EventHandler
    public void onPlayerAdvancementDoneEvent(org.bukkit.event.player.PlayerAdvancementDoneEvent event) {
        PlayerAdvancementDoneEvent(event);
    }

    @EventHandler
    public void onPlayerArmorStandManipulateEvent(org.bukkit.event.player.PlayerArmorStandManipulateEvent event) {
        PlayerArmorStandManipulateEvent(event);
    }

    @EventHandler
    public void onPlayerChangedWorldEvent(org.bukkit.event.player.PlayerChangedWorldEvent event) {
        PlayerChangedWorldEvent(event);
    }

    @EventHandler
    public void onPlayerChannelEvent(org.bukkit.event.player.PlayerChannelEvent event) {
        PlayerChannelEvent(event);
    }

    @EventHandler
    public void onPlayerChatEvent(org.bukkit.event.player.PlayerChatEvent event) {
        PlayerChatEvent(event);
    }

    @EventHandler
    public void onPlayerChatTabCompleteEvent(org.bukkit.event.player.PlayerChatTabCompleteEvent event) {
        PlayerChatTabCompleteEvent(event);
    }

    @EventHandler
    public void onPlayerCommandPreprocessEvent(org.bukkit.event.player.PlayerCommandPreprocessEvent event) {
        PlayerCommandPreprocessEvent(event);
    }

    @EventHandler
    public void onPlayerCommandSendEvent(org.bukkit.event.player.PlayerCommandSendEvent event) {
        PlayerCommandSendEvent(event);
    }

    @EventHandler
    public void onPlayerDropItemEvent(org.bukkit.event.player.PlayerDropItemEvent event) {
        PlayerDropItemEvent(event);
    }

    @EventHandler
    public void onPlayerEditBookEvent(org.bukkit.event.player.PlayerEditBookEvent event) {
        PlayerEditBookEvent(event);
    }

    @EventHandler
    public void onPlayerInteractEvent(org.bukkit.event.player.PlayerInteractEvent event) {
        PlayerInteractEvent(event);
    }

    @EventHandler
    public void onPlayerMoveEvent(org.bukkit.event.player.PlayerMoveEvent event) {
        PlayerMoveEvent(event);
    }


    @EventHandler
    public void onPlayerExpChangeEvent(org.bukkit.event.player.PlayerExpChangeEvent event) {
        PlayerExpChangeEvent(event);
    }

    @EventHandler
    public void onPlayerFishEvent(org.bukkit.event.player.PlayerFishEvent event) {
        PlayerFishEvent(event);
    }

    @EventHandler
    public void onPlayerFishEvent(org.bukkit.event.player.PlayerGameModeChangeEvent event) {
        PlayerGameModeChangeEvent(event);
    }


    @EventHandler
    public void onPlayerHideEntityEvent(org.bukkit.event.player.PlayerHideEntityEvent event) {
        PlayerHideEntityEvent(event);
    }

    @EventHandler
    public void onPlayerInteractAtEntityEvent(org.bukkit.event.player.PlayerInteractAtEntityEvent event) {
        PlayerInteractAtEntityEvent(event);
    }

    @EventHandler
    public void onPlayerInteractEntityEvent(org.bukkit.event.player.PlayerInteractEntityEvent event) {
        PlayerInteractEntityEvent(event);
    }

    @EventHandler
    public void onPlayerItemBreakEvent(org.bukkit.event.player.PlayerItemBreakEvent event) {
        PlayerItemBreakEvent(event);
    }

    @EventHandler
    public void onPlayerItemConsumeEvent(org.bukkit.event.player.PlayerItemConsumeEvent event) {
        PlayerItemConsumeEvent(event);
    }

    @EventHandler
    public void onPlayerItemDamageEvent(org.bukkit.event.player.PlayerItemDamageEvent event) {
        PlayerItemDamageEvent(event);
    }

    @EventHandler
    public void onPlayerItemHeldEvent(org.bukkit.event.player.PlayerItemHeldEvent event) {
        PlayerItemHeldEvent(event);
    }

    @EventHandler
    public void onPlayerItemMendEvent(org.bukkit.event.player.PlayerItemMendEvent event) {
        PlayerItemMendEvent(event);
    }

    @EventHandler
    public void onPlayerKickEvent(org.bukkit.event.player.PlayerKickEvent event) {
        PlayerKickEvent(event);
    }

    @EventHandler
    public void onPlayerLevelChangeEvent(org.bukkit.event.player.PlayerLevelChangeEvent event) {
        PlayerLevelChangeEvent(event);
    }

    @EventHandler
    public void onPlayerLocaleChangeEvent(org.bukkit.event.player.PlayerLocaleChangeEvent event) {
        PlayerLocaleChangeEvent(event);
    }

    @EventHandler
    public void onPlayerLoginEvent(org.bukkit.event.player.PlayerLoginEvent event) {
        PlayerLoginEvent(event);
    }

    @EventHandler
    public void onPlayerLoginEvent(org.bukkit.event.player.PlayerPickupArrowEvent event) {
        PlayerPickupArrowEvent(event);
    }

    @EventHandler
    public void onPlayerPickupItemEvent(org.bukkit.event.player.PlayerPickupItemEvent event) {
        PlayerPickupItemEvent(event);
    }

    @EventHandler
    public void onPlayerPortalEvent(org.bukkit.event.player.PlayerPortalEvent event) {
        PlayerPortalEvent(event);
    }

    @EventHandler
    public void onPlayerPreLoginEvent(org.bukkit.event.player.PlayerPreLoginEvent event) {
        PlayerPreLoginEvent(event);
    }

    @EventHandler
    public void onPlayerRecipeDiscoverEvent(org.bukkit.event.player.PlayerRecipeDiscoverEvent event) {
        PlayerRecipeDiscoverEvent(event);
    }

    @EventHandler
    public void onPlayerRecipeDiscoverEvent(org.bukkit.event.player.PlayerRegisterChannelEvent event) {
        PlayerRegisterChannelEvent(event);
    }

    @EventHandler
    public void onPlayerResourcePackStatusEvent(org.bukkit.event.player.PlayerResourcePackStatusEvent event) {
        PlayerResourcePackStatusEvent(event);
    }

    @EventHandler
    public void onPlayerRespawnEvent(org.bukkit.event.player.PlayerRespawnEvent event) {
        PlayerRespawnEvent(event);
    }

    @EventHandler
    public void onPlayerRiptideEvent(org.bukkit.event.player.PlayerRiptideEvent event) {
        PlayerRiptideEvent(event);
    }


    @EventHandler
    public void onPlayerShearEntityEvent(org.bukkit.event.player.PlayerShearEntityEvent event) {
        PlayerShearEntityEvent(event);
    }

    @EventHandler
    public void onPlayerShowEntityEvent(org.bukkit.event.player.PlayerShowEntityEvent event) {
        PlayerShowEntityEvent(event);
    }

    @EventHandler
    public void onPlayerStatisticIncrementEvent(org.bukkit.event.player.PlayerStatisticIncrementEvent event) {
        PlayerStatisticIncrementEvent(event);
    }

    // PlayerSwapHandItemsEvent
    @EventHandler
    public void onPlayerSwapHandItemsEvent(org.bukkit.event.player.PlayerSwapHandItemsEvent event) {
        PlayerSwapHandItemsEvent(event);
    }

    @EventHandler
    public void onPlayerTakeLecternBookEvent(org.bukkit.event.player.PlayerTakeLecternBookEvent event) {
        PlayerTakeLecternBookEvent(event);
    }

    //PlayerTeleportEvent
    @EventHandler
    public void onPlayerTeleportEvent(org.bukkit.event.player.PlayerTeleportEvent event) {
        PlayerTeleportEvent(event);
    }

    @EventHandler
    public void onPlayerToggleFlightEvent(org.bukkit.event.player.PlayerToggleFlightEvent event) {
        PlayerToggleFlightEvent(event);
    }

    @EventHandler
    public void onPlayerToggleSneakEvent(org.bukkit.event.player.PlayerToggleSneakEvent event) {
        PlayerToggleSneakEvent(event);
    }

    @EventHandler
    public void onPlayerToggleSprintEvent(org.bukkit.event.player.PlayerToggleSprintEvent event) {
        PlayerToggleSprintEvent(event);
    }

    @EventHandler
    public void onPlayerUnleashEntityEvent(org.bukkit.event.player.PlayerUnleashEntityEvent event) {
        PlayerUnleashEntityEvent(event);
    }

    @EventHandler
    public void onPlayerUnregisterChannelEvent(org.bukkit.event.player.PlayerUnregisterChannelEvent event) {
        PlayerUnregisterChannelEvent(event);
    }


    @EventHandler
    public void onPlayerVelocityEvent(org.bukkit.event.player.PlayerVelocityEvent event) {
        PlayerVelocityEvent(event);
    }

    /**
     * Block Event Functions
     */
    @EventHandler
    public void onBlockBreakEvent(org.bukkit.event.block.BlockBreakEvent event) {
        BlockBreakEvent(event);
    }

    @EventHandler
    public void onBlockBurnEvent(org.bukkit.event.block.BlockBurnEvent event) {
        BlockBurnEvent(event);
    }

    @EventHandler
    public void onBlockCanBuildEvent(org.bukkit.event.block.BlockCanBuildEvent event) {
        BlockCanBuildEvent(event);
    }

    @EventHandler
    public void onBlockCookEvent(org.bukkit.event.block.BlockCookEvent event) {
        BlockCookEvent(event);
    }

    @EventHandler
    public void onBlockDamageAbortEvent(org.bukkit.event.block.BlockDamageAbortEvent event) {
        BlockDamageAbortEvent(event);
    }

    @EventHandler
    public void onBlockDamageEvent(org.bukkit.event.block.BlockDamageEvent event) {
        BlockDamageEvent(event);
    }

    @EventHandler
    public void onBlockDispenseArmorEvent(org.bukkit.event.block.BlockDispenseArmorEvent event) {
        BlockDispenseArmorEvent(event);
    }

    @EventHandler
    public void onBlockDispenseEvent(org.bukkit.event.block.BlockDispenseEvent event) {
        BlockDispenseEvent(event);
    }

    @EventHandler
    public void onBlockDropItemEvent(org.bukkit.event.block.BlockDropItemEvent event) {
        BlockDropItemEvent(event);
    }

    @EventHandler
    public void onBlockExpEvent(org.bukkit.event.block.BlockExpEvent event) {
        BlockExpEvent(event);
    }

    @EventHandler
    public void onBlockExplodeEvent(org.bukkit.event.block.BlockExplodeEvent event) {
        BlockExplodeEvent(event);
    }

    @EventHandler
    public void onBlockFadeEvent(org.bukkit.event.block.BlockFadeEvent event) {
        BlockFadeEvent(event);
    }

    @EventHandler
    public void onBlockFertilizeEvent(org.bukkit.event.block.BlockFertilizeEvent event) {
        BlockFertilizeEvent(event);
    }

    @EventHandler
    public void onBlockFormEvent(org.bukkit.event.block.BlockFormEvent event) {
        BlockFormEvent(event);
    }

    @EventHandler
    public void onBlockGrowEvent(org.bukkit.event.block.BlockGrowEvent event) {
        BlockGrowEvent(event);
    }

    @EventHandler
    public void onBlockIgniteEvent(org.bukkit.event.block.BlockIgniteEvent event) {
        BlockIgniteEvent(event);
    }

    @EventHandler
    public void onBlockPhysicsEvent(org.bukkit.event.block.BlockPhysicsEvent event) {
        BlockPhysicsEvent(event);
    }

    @EventHandler
    public void onBlockPistonExtendEvent(org.bukkit.event.block.BlockPistonExtendEvent event) {
        BlockPistonExtendEvent(event);
    }

    @EventHandler
    public void onBlockPistonRetractEvent(org.bukkit.event.block.BlockPistonRetractEvent event) {
        BlockPistonRetractEvent(event);
    }

    @EventHandler
    public void onBlockPlaceEvent(org.bukkit.event.block.BlockPlaceEvent event) {
        BlockPlaceEvent(event);
    }

    @EventHandler
    public void onBlockReceiveGameEvent(org.bukkit.event.block.BlockReceiveGameEvent event) {
        BlockReceiveGameEvent(event);
    }

    @EventHandler
    public void onBlockRedstoneEvent(org.bukkit.event.block.BlockRedstoneEvent event) {
        BlockRedstoneEvent(event);
    }

    @EventHandler
    public void onBlockShearEntityEvent(org.bukkit.event.block.BlockShearEntityEvent event) {
        BlockShearEntityEvent(event);
    }

    @EventHandler
    public void onBlockSpreadEvent(org.bukkit.event.block.BlockSpreadEvent event) {
        BlockSpreadEvent(event);
    }

    @EventHandler
    public void onCauldronLevelChangeEvent(org.bukkit.event.block.CauldronLevelChangeEvent event) {
        CauldronLevelChangeEvent(event);
    }


    @EventHandler
    public void onFluidLevelChangeEvent(org.bukkit.event.block.FluidLevelChangeEvent event) {
        FluidLevelChangeEvent(event);
    }

    @EventHandler
    public void onLeavesDecayEvent(org.bukkit.event.block.LeavesDecayEvent event) {
        LeavesDecayEvent(event);
    }

    @EventHandler
    public void onMoistureChangeEvent(org.bukkit.event.block.MoistureChangeEvent event) {
        MoistureChangeEvent(event);
    }

    @EventHandler
    public void onNotePlayEvent(org.bukkit.event.block.NotePlayEvent event) {
        NotePlayEvent(event);
    }

    @EventHandler
    public void onSignChangeEvent(org.bukkit.event.block.SignChangeEvent event) {
        SignChangeEvent(event);

    }

    @EventHandler
    public void onSpongeAbsorbEvent(org.bukkit.event.block.SpongeAbsorbEvent event) {
        SpongeAbsorbEvent(event);
    }

}