package ua.gostart.goit.MusicShop;


public class Piano extends MusicalInstrument {


    String name;

    public Piano(String name) {
        this.name = name;
        System.out.println("Работает:public class Piano-----------------------------------------------------------------------------------------");
        System.out.println("Создали объект с именем: " + name);
    }
}