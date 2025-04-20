package zip.packforge.api.model.impl;

import zip.packforge.api.model.BaseModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import com.google.gson.annotations.SerializedName;

@Getter
@SuperBuilder
@NoArgsConstructor
public class Item extends BaseModel {
    @SerializedName("material")
    private String material;
    
    @SerializedName("custom_model_data")
    private int customModelData;

    @SerializedName("category_id")
    private Integer categoryId;
}