package zip.packforge.api.model.impl;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import zip.packforge.api.model.BaseModel;

@Getter
@SuperBuilder
@NoArgsConstructor
public class Pack extends BaseModel {
    private String namespace;
    @SerializedName("pack_version")
    private String packVersion;
}
