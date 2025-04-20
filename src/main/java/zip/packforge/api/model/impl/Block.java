package zip.packforge.api.model.impl;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import zip.packforge.api.model.BaseModel;

@Getter
@SuperBuilder
@NoArgsConstructor
public class Block extends BaseModel {

    private NoteBlock noteBlock;

    @Getter
    @NoArgsConstructor
    public static class NoteBlock {
        private int id;
        private int instrument;
        private int note;

        @SerializedName("is_one_sided")
        private boolean isOneSided;
    }
}
