package zip.packforge.api.model.impl;

import com.google.gson.annotations.SerializedName;
import zip.packforge.api.model.BaseModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
public class Sound extends BaseModel {
    private String description;

    private double volume;
    private double pitch;

    @SerializedName("is_stream")
    private boolean isStream;

    private boolean preload;

    @SerializedName("attenuation_distance")
    private int attenuationDistance;

    @SerializedName("sound_category")
    private String soundCategory;

    private String subtitle;

    @SerializedName("category_id")
    private Integer categoryId;
}
