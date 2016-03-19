package ua.gostart.goit.MusicShop;

import java.util.*;

public class MusicShop1 {

    public List<Guitar> guitars = new ArrayList();
    public List<Piano> pianos = new ArrayList();
    public List<Trumpet> trumpets = new ArrayList();

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public List<Trumpet> getTrumpets() {
        return trumpets;
    }

    public List<Piano> getPianos() {
        return pianos;

    }

    public void show() {
        System.out.println("Работает:public class MusicShop1/public void show()-----------------------------------------------------------------------------------------");
        System.out.println("В списке гитар у нас объекты с именами");
        for (int i = 0; i <getGuitars().size() ; i++) {
            System.out.println(guitars.get(i).name);
        }
        System.out.println("В списке пианино у нас объекты с именами");
        for (int i = 0; i <getPianos().size() ; i++) {
            System.out.println(pianos.get(i).name);
        }
        System.out.println("В списке труб у нас объекты с именами");
        for (int i = 0; i <getTrumpets().size() ; i++) {
            System.out.println(trumpets.get(i).name);
        }
    }
}



