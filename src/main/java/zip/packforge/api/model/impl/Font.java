package zip.packforge.api.model.impl;

import com.google.gson.annotations.SerializedName;
import zip.packforge.api.model.BaseModel;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
@NoArgsConstructor
public class Font extends BaseModel {
    private String symbol;
    private String placeholder;
    private int ascent;
    private int height;
    @SerializedName("category_id")
    private Integer categoryId;
}