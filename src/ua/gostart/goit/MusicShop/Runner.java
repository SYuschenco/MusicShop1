package ua.gostart.goit.MusicShop;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Runner {

    public static void main(String[] args) {

        //создаём для доступа к методу servises.prepareInstruments(order,musicShop1).size();
        Servises servises = new Servises();

        //создаём для доступа к musicShop1.getGuitars().add(guitar1);
        MusicShop1 musicShop1 = new MusicShop1();

        //создаём объекты классов с именами ("guitar1"),("guitar2") и т.д. - эти параметры передаются конструктору класса
        // и записываются в поле name в классе Guitar, Piano, Trumpet
        Guitar guitar1 = new Guitar("guitar1");
        Guitar guitar2 = new Guitar("guitar2");
        Guitar guitar3 = new Guitar("guitar3");

        Piano piano1 = new Piano("piano1");
        Piano piano2 = new Piano("piano2");
        Piano piano3 = new Piano("piano3");

        Trumpet trumpet1 = new Trumpet("trumpet1");
        Trumpet trumpet2 = new Trumpet("trumpet2");
        Trumpet trumpet3 = new Trumpet("trumpet3");

        //добавляем объекты в списки командой: musicShop1.getGuitars().add(guitar1);....и другими.
        //Списки созданы в классе MusicShop1 строками:
        //public List<Guitar> guitars = new ArrayList();
        //public List<Piano> pianos = new ArrayList();
        //public List<Trumpet> trumpets = new ArrayList();
        //используя метод getGuitars()класса MusicShop1 используя объектную переменную musicShop1,созданную выше
        //добавляем в списки каждого из типов инструментов все созданные выше объекты:

        musicShop1.getGuitars().add(guitar1);
        musicShop1.getGuitars().add(guitar2);
        musicShop1.getGuitars().add(guitar3);

        musicShop1.getPianos().add(piano1);
        musicShop1.getPianos().add(piano2);
        musicShop1.getPianos().add(piano3);

        musicShop1.getTrumpets().add(trumpet1);
        musicShop1.getTrumpets().add(trumpet2);
        musicShop1.getTrumpets().add(trumpet3);

        //напечатаем то что в списках после добавления методом musicShop1.show();
        System.out.println("Работает public class Runner-----------------------------------------------------------------------------------------");
        musicShop1.show();

        //создаём заказ Map<String, Integer> order = new HashMap<>(); и заполняем его ключами
        // и количеством order.put("guitar", 2);
        Map<String, Integer> order = new HashMap<>();
        order.put("guitar", 2);
        order.put("trumpet", 2);
        order.put("piano", 2);
        //order.put("piano1", 2);

        //вызываем метод подготовки заказа к отгрузке servises.prepareInstruments(order,musicShop1).size();
        // параметрами передаём заказ и магазин
        int n= servises.prepareInstruments(order,musicShop1).size();
        //
        //System.out.println(n);
        //показываем какие объекты в списке заказов
        servises.showListOrderToSale();

//        System.out.println("Работает public class Runner-----------------------------------------------------------------------------------------");
//        musicShop1.getGuitars().remove(0);
//        musicShop1.getGuitars().remove(1);
//        musicShop1.getGuitars().remove(2);
        musicShop1.show();

        //System.out.println(servises.prepareInstruments(order,musicShop1));

    }
}

//    Добавить в магазин инструментов метод, который готовит к отгрузке партию музыкальных инструментов согласно заказу.
//
//        Сигнатура метода:
//          public List<Instrument> prepareInstruments(Map<String, Integer> order){...}
//
//        В заказе (Map<String, Integer> order) хранится название инструмента и количество необходимых инструментов.
//
//        Ключем в заказе является одна из строк "piano", "guitar", "trumpet"
//
//        Создать свое исключение, которое будет брошено в случае, когда ключ в заказе другой.
//
//        Каким-то образом (самостоятельно выбрать решение) обработать ситуацию,
//        когда количество элементов в заказе отрицательное, нулевое.
//
//        После выполнения метода из магазина должны пропасть те инструменты, которые были отгружены.
//        В случае, когда количество запрашиваемых инструментов определенного типа больше, чем количество
//        доступных инструментов в магазине, должно быть брошено исключение. Выбрать наиболее подходящее из
//        доступных в стандартной библиотеке исключений
//
//          Пример:
//
//        в магазине было 2 фортепиано, 16 гитар и 7 труб.
//        пришел заказ на 7 гитар и 2 трубы.
//        после выполнения заказа в магазине осталось 2 фортепиано, 9 гитар и 5 труб
//        пришел заказ на 1 фортепиано
//        после выполнения заказа в магазине осталось 1 фортепиано, 9 гитар и 5 труб
//        пришел заказ на 1 фортепиано, 8 гитар и 6 труб
//        товар не был отгружен (было брошено исключение)
//        в магазине осталось 1 фортепиано, 9 гитар и 5 труб