package ua.gostart.goit.MusicShop;

public abstract class MusicalInstrument {
    private String name;

    public MusicalInstrument(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
