package zip.packforge.api.events;

import lombok.Getter;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.Action;

@Getter
public class CustomBlockInteractEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Block block;
    private final zip.packforge.api.model.impl.Block customBlock;
    private final Action action;
    private final Player player;

    public CustomBlockInteractEvent(Block block, zip.packforge.api.model.impl.Block customBlock, Action action, Player player) {
        this.block = block;
        this.customBlock = customBlock;
        this.action = action;
        this.player = player;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}