package ua.gostart.goit.MusicShop;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Servises {


    //Создаём список возможных к продаже товаров исходя из полученного заказа
    List<MusicalInstrument> listOrderToSale = new ArrayList();

    public List<MusicalInstrument> getListOrderToSale() {
        return listOrderToSale;
    }

    //Метод обработки заказа(Map<String, Integer> order) и остатков магазина (MusicShop1 musicShop1)
    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order, MusicShop1 musicShop1) {

        //Set<String> keysOrderSet - набору ключей в заказе
        Set<String> keysOrderSet = order.keySet();
        System.out.println("Работает public class Servises/prepareInstruments(арг1,арг2)-----------------------------------------------------------------------------------------");
        System.out.println("keysOrderSet - это набор ключей в заказе. Всего в заказе ключей сейчас - "+keysOrderSet.size());
        System.out.println("Значения keysOrderSet:"+keysOrderSet.toString());
        System.out.println("Работает public class Servises/prepareInstruments(арг1,арг2)-----------------------------------------------------------------------------------------");
        System.out.println("Печатаем весь поступивший заказ (создан в классе Runner Map<String, Integer> order = new HashMap<>();):");
        //order.get(k) -  это количество соответствующее ключу (типа инструмента) в заказе
        //ключ-количество это особенность устройства конструкции интерфейса Map.
        System.out.println("Ключ|Количество");
        for (String k: keysOrderSet) {
            System.out.println(k+"| "+order.get(k));
        }
        System.out.println("Работает public class Servises/prepareInstruments(арг1,арг2)-----------------------------------------------------------------------------------------");

        //Цикл по перебору ключей в заказе k -это guitar,trumpet,piano
        for (String k : keysOrderSet) {
            System.out.println("Работает public class Servises/prepareInstruments(арг1,арг2)/for (String k : keysOrderSet) {-----------------------------------------------------------------------------------------");
            System.out.println("k="+k);
            //Проверяем условие: если k(текущий ключ заказа) соответствует guitar и количество в заказе по данному ключу
            //меньше либо равно количеству остатков гитар в магазине тогда идём на цикл
            if (k.equals("guitar") && order.get(k) <= musicShop1.getGuitars().size()) {
                System.out.println("Работает public class Servises/prepareInstruments(арг1,арг2)/if (k.equals(\"guitar\") && order.get(k) <= musicShop1.getGuitars().size()) { {-----------------------------------------------------------------------------------------");
                System.out.println("Значение \"k.equals(\"guitar\")="+k.equals("guitar"));
                System.out.println("Значение order.get(k)=" + order.get(k));
                System.out.println("Значение musicShop1.getGuitars().size()=" + musicShop1.getGuitars().size());
                // В цикле формируется список заказа гитар listOrderToSale.add(musicShop1.getGuitars().get(i));
                for (int i = 0; i < order.get(k); i++) {
                    //формируется список заказа на продажу
                    listOrderToSale.add(musicShop1.getGuitars().get(i));
                    System.out.println("В список заказа для продажи добавляется - " + musicShop1.getGuitars().get(i).name);
                    System.out.println("Из списка остатков магазина удаляется - " + musicShop1.getGuitars().get(i).name);
                    musicShop1.getGuitars().remove(i);

                }
                // 1               System.out.println(i);

//                musicShop1.getGuitars().size()=musicShop1.getGuitars().size()-1;
            }
            else if (k.equals("trumpet") && order.get(k) <= musicShop1.getTrumpets().size()) {

                for (int i = 0; i < order.get(k); i++) {
                    listOrderToSale.add(musicShop1.getTrumpets().get(i));

                    System.out.println("В список заказа для продажи добавляется - " + musicShop1.getTrumpets().get(i).name);
                    System.out.println("Из списка остатков магазина удаляется - " + musicShop1.getTrumpets().get(i).name);
                    musicShop1.getTrumpets().remove(i);
                }
            } else if (k.equals("piano") && order.get(k) <= musicShop1.getPianos().size()) {

                for (int i = 0; i < order.get(k); i++) {
                    listOrderToSale.add(musicShop1.getPianos().get(i));

                    System.out.println("В список заказа для продажи добавляется - " + musicShop1.getPianos().get(i).name);
                    System.out.println("Из списка остатков магазина удаляется - " + musicShop1.getPianos().get(i).name);
                    musicShop1.getPianos().remove(i);
                }
            }
        }
        //Печатаем сколько всего товаров в списке заказов на отгрузку
        System.out.println("Всего товаров в списке заказов на отгрузку - " + listOrderToSale.size());
        return listOrderToSale;
    }

    public void showListOrderToSale(){

        System.out.println("Работает public class Servises/ShowlistOrderToSale(){-----------------------------------------------------------------------------------------");
        System.out.println("В полном списке для продажи у нас объекты с именами");
        for (int i = 0; i <listOrderToSale.size() ; i++) {
            /// Не могу вывести имя объекта в списке.
            System.out.println(listOrderToSale.get(i).getClass().getName());

            //System.out.println(listOrderToSale);
        }
    }
}