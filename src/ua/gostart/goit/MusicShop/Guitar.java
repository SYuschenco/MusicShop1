package ua.gostart.goit.MusicShop;

public class Guitar extends MusicalInstrument {

    String name;

    public Guitar(String name) {
        this.name = name;
        System.out.println("Работает:public class Guitar-----------------------------------------------------------------------------------------");
        System.out.println("Создали объект с именем: " + name);
    }


}