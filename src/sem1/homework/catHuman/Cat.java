package sem1.homework.catHuman;

public class Cat extends Entity{
    public enum Condition{
        good,
        angry,
        sleep
    }
    private Condition condition;
    public Cat(String name, int age){
        super(name, age);
        this.condition = Condition.sleep;
    }
    public void speak(Cat cat){
        if(!(cat.condition == Condition.sleep)) {
            if (cat.condition == Condition.angry) {
                System.out.println("Вас поцарапали");
            } else {
                System.out.println("Мяу");
            }
        }
    }
    public void eat(Cat cat){
        if(cat.condition == Condition.angry){
            cat.condition = Condition.good;
        }

    }
    public void wakeUp(Cat cat){
        cat.condition = Condition.angry;
        System.out.println("Кошка проснулась");
    }

}
