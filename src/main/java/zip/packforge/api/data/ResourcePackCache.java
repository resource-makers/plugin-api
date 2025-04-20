package zip.packforge.api.data;

import lombok.Getter;
import zip.packforge.api.model.impl.*;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Getter
public class ResourcePackCache {
    private final List<Block> blocks = new CopyOnWriteArrayList<>();
    private final List<Item> items = new CopyOnWriteArrayList<>();
    private final List<Font> fonts = new CopyOnWriteArrayList<>();
    private final List<Sound> sounds = new CopyOnWriteArrayList<>();
    private final List<Category> categories = new CopyOnWriteArrayList<>();

    public void loadData(ResourcePackData data) {
        blocks.clear();
        items.clear();
        fonts.clear();
        sounds.clear();
        categories.clear();

        blocks.addAll(data.getBlocks());
        items.addAll(data.getItems());
        fonts.addAll(data.getFonts());
        sounds.addAll(data.getSounds());
        categories.addAll(data.getCategories());
    }

}