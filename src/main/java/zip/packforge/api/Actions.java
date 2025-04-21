package zip.packforge.api;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import zip.packforge.api.data.ResourcePackCache;
import zip.packforge.api.model.impl.*;

public interface Actions {
    ResourcePackCache cache();
    
    default java.util.List<Item> getItems() { return cache().getItems(); }
    default java.util.List<Block> getBlocks() { return cache().getBlocks(); }
    default java.util.List<Font> getFonts() { return cache().getFonts(); }
    default java.util.List<Sound> getSounds() { return cache().getSounds(); }

    boolean itemExists(int id);
    boolean itemExists(String name);
    boolean blockExists(int id);
    boolean blockExists(String name);
    boolean fontExists(int id);
    boolean fontExists(String name);
    boolean soundExists(int id);
    boolean soundExists(String name);

    default Pack getPack() { return cache().getPack(); }
    default String getNamespace() { return getPack().getNamespace(); }

    Item getItem(int id);
    Item getItem(String name);
    Block getBlock(int id);
    Block getBlock(String name);
    Font getFont(int id);
    Font getFont(String name);
    Sound getSound(int id);
    Sound getSound(String name);

    ItemStack getItemStack(Item item);
    ItemStack getItemStack(Block block);

    void applyItemProperties(ItemStack itemStack, Item item);

    ItemStack addToInventory(Player player, Item item);
    ItemStack addToInventory(Player player, Item item, int amount);

    void playSound(Sound sound, Player player);
    void playSound(Sound sound, Location location);

    org.bukkit.block.Block placeBlock(Location location, Block block);
    org.bukkit.block.Block placeBlock(Location location, Block block, Player placer);

    void createBossbar(Player player, String text);
}
