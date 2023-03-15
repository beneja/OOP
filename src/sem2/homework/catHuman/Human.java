package sem2.homework.catHuman;

public class Human extends Animal implements BaseAction {
    Sex sex;

    public Human(String name, Sex sex, int age) {
        super(name, age);
        this.sex = sex;

    }
    public void callСat(Cat cat){//позвать кошку
        System.out.println("Кис-кис");
        cat.reaction();
    }
//    public void feed(Cat cat){//кормим кошку
//        cat.eat();//кошка есть
//        System.out.println("Кошка поела");
//    }

    @Override
    public void eat() {
        System.out.println("человек ест");
    }

    @Override
    public void move() {
        this.setFatigue(-1);
    }
}
