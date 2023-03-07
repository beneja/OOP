package sem1.homework.GeoTree;
public class Main {

    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        irina.setAge(10);
        Person vasya = new Person("Вася");
        vasya.setAge(11);
        Person masha = new Person("Маша");
        masha.setAge(13);
        Person jane = new Person("Женя");
        jane.setAge(24);
        Person ivan = new Person("Ваня");
        ivan.setAge(25);
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.appendSibling(vasya, masha);
        gt.appendSibling(masha, vasya);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        gt.appendSibling(jane, ivan);
        gt.appendSibling(ivan, jane);

        System.out.println(gt);

        System.out.println(new Research(gt).spend(irina,
                Relationship.parent));

        System.out.println(new Research(gt).isSibling(gt));

        System.out.println(new Research(gt).ageMoreThan(gt,13));

        System.out.println(new Research(gt).familyTies(gt,irina,vasya));
    }

}