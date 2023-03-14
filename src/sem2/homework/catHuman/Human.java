package sem2.homework.catHuman;

public class Human extends Animal implements BaseAction {
    Sex sex;
    private Condition condition;
    public Human(String name, Sex sex, int age) {
        super(name, age);
        this.sex = sex;
        this.condition = Condition.good;
    }
    public void callСat(Cat cat){//позвать кошку
        System.out.println("Кис-кис");
        cat.reaction();
    }
    public void feed(Cat cat){//кормим кошку
        cat.eat();//кошка есть
        System.out.println("Кошка поела");
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public void eat() {
        if(condition == Condition.angry){
            condition = Condition.good;
        }
    }

    @Override
    public void move() {
        this.setFatigue(-1);
    }
}
