package sem2.homework.catHuman;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Human ivan = new Human("Иван",Sex.man, 20);
        Cat murka = new Cat("Мурка", 3);
        Parrot kesha = new Parrot("Кеша", 2, "белый");
        Hamster napoleon = new Hamster("Наполеон", 1);

        ivan.callСat(murka);
        ivan.feed(murka);
        ivan.callСat(murka);
        ArrayList<Object> list = new ArrayList<>();
        list.add(murka);
        list.add(kesha);
        list.add(napoleon);

        Collections.sort(list, new FatigueComparator()); //??
    }
}
