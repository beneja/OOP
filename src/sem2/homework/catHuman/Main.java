package sem2.homework.catHuman;

public class Main {
    public static void main(String[] args) {
        Human ivan = new Human("Иван",Sex.man, 20);
        Cat murka = new Cat("Мурка", 3);
        Parrot kesha = new Parrot("Кеша", 2, "белый");
        Hamster napoleon = new Hamster("Наполеон", 1, 10);
        ivan.callСat(murka);
        ivan.wakeUp(murka);
        ivan.callСat(murka);
        ivan.feed(murka);
        ivan.callСat(murka);
        murka.purr(ivan);
    }
}
