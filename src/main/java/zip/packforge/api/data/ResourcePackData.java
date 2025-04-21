package zip.packforge.api.data;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import zip.packforge.api.model.impl.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResourcePackData {

    @Builder.Default
    @SerializedName("pack")
    private Pack pack;

    @Builder.Default
    @SerializedName("blocks")
    private List<Block> blocks = new ArrayList<>();

    @Builder.Default
    @SerializedName("items")
    private List<Item> items = new ArrayList<>();

    @Builder.Default
    @SerializedName("fonts")
    private List<Font> fonts = new ArrayList<>();

    @Builder.Default
    @SerializedName("sounds")
    private List<Sound> sounds = new ArrayList<>();

    @Builder.Default
    @SerializedName("categories")
    private List<Category> categories = new ArrayList<>();
}