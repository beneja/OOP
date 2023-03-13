package sem2.homework.GeoTree;
public class Main {

    public static void main(String[] args) {
        Person irina = new Person("Ирина", Gender.woman, 10);
        Person vasya = new Person("Вася", Gender.man, 11);
        Person masha = new Person("Маша",Gender.woman, 13);
        Person jane = new Person("Женя",Gender.man, 24);
        Person ivan = new Person("Ваня",Gender.man, 25);

        GeoTree gt = new GeoTree();
        gt.appendParent(irina, vasya);
        gt.appendParent(irina, masha);
        gt.appendSibling(vasya, masha);
        gt.appendSibling(masha, vasya);
        gt.appendParent(vasya, jane);
        gt.appendParent(vasya, ivan);
        gt.appendSibling(jane, ivan);
        gt.appendSibling(ivan, jane);

        System.out.println(gt);

        System.out.println(gt.spend(irina,
                Relationship.parent));

        System.out.println(gt.isSibling(gt));

        System.out.println(gt.ageMoreThan(gt,13));

        gt.familyTies(gt);
    }

}