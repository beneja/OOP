package sem1.homework.catHuman;

public class Human extends Entity {

    String name;
    int age;
    Sex sex;

    public Human(String name, Sex sex, int age) {
        super(name, age);
        this.sex = sex;
    }
    public void callСat(Cat cat){//позвать кошку
        System.out.println("Кис-кис");
        cat.speak(cat);
    }
    public void feed(Cat cat){//кормим кошку
        cat.eat(cat);//кошка есть
        System.out.println("Кошка поела");
    }
    public void wapeUp(Cat cat){
        cat.wakeUp(cat);
    }
}
