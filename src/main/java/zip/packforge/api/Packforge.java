package zip.packforge.api;


import lombok.Setter;

public class Packforge {

    @Setter
    private static Actions actions;


    public static Actions getPackforge() {
        return actions;
    }
}