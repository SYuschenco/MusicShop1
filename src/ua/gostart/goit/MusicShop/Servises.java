package ua.gostart.goit.MusicShop;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Servises {


    MusicShop1 musicShop1 = new MusicShop1();
    List<MusicalInstrument> list = new ArrayList();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) {


        Set<String> strings = order.keySet();


        for (String k : strings) {
            if (k.equals("guitar") && order.get(k) <= musicShop1.getGuitars().size()) {

                for (Guitar g : musicShop1.getGuitars()) {
                    list.add(g);
                }
            } else if (k.equals("trumpet") && order.get(k) <= musicShop1.getTrumpets().size()) {

                for (Trumpet t : musicShop1.getTrumpets()) {
                    list.add(t);
                }
            } else if (k.equals("piano") && order.get(k) <= musicShop1.getPianos().size()) {

                for (Piano p : musicShop1.getPianos()) {
                    list.add(p);
                }
            }

        }
        return list;
    }

}
