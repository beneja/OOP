package sem1.homework.GeoTree;
public class Main {

    public static void main(String[] args) {
        Person irina = new Person("Ирина", 10);
        Person vasya = new Person("Вася", 11);
        Person masha = new Person("Маша", 13);
        Person jane = new Person("Женя", 24);
        Person ivan = new Person("Ваня", 25);

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

        System.out.println(new Research(gt).spend(irina,
                Relationship.parent));

        System.out.println(new Research(gt).isSibling(gt));

        System.out.println(new Research(gt).ageMoreThan(gt,13));

      //  System.out.println(new Research(gt).familyTies(gt,irina,vasya));
    }

}