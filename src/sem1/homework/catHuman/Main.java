package sem1.homework.catHuman;

public class Main {
    public static void main(String[] args) {
        Human ivan = new Human("Иван",Sex.man, 20);
        Cat murka = new Cat("Мурка", 3);
        ivan.callСat(murka);
        ivan.wapeUp(murka);
        ivan.callСat(murka);
        ivan.feed(murka);
        ivan.callСat(murka);
    }
}
