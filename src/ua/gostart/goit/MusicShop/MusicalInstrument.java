package ua.gostart.goit.MusicShop;


public abstract class MusicalInstrument {
    String typeName;

    public MusicalInstrument(String name) {
        this.typeName = name;
        System.out.println("typeName " + typeName);
    }

    protected MusicalInstrument() {

    }

    public String getName() {
        return typeName;
    }
}