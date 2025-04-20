package zip.packforge.api.events;

import lombok.Getter;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
public class CustomBlockPlaceEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Block block;
    private final BlockState replacedBlockState;
    private final zip.packforge.api.model.impl.Block customBlock;
    private final Player player;

    public CustomBlockPlaceEvent(Block block, BlockState replacedBlockState, zip.packforge.api.model.impl.Block customBlock) {
        this(block, replacedBlockState, customBlock, null);
    }

    public CustomBlockPlaceEvent(Block block, BlockState replacedBlockState, zip.packforge.api.model.impl.Block customBlock, Player player) {
        this.block = block;
        this.replacedBlockState = replacedBlockState;
        this.customBlock = customBlock;
        this.player = player;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}