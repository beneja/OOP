package sem2.homework.catHuman;

public class Cat extends Animal implements BaseAction, CreatureAction {
    private Condition condition;

    public Cat(String name, int age){
        super(name, age);
        this.condition = Condition.sleep;
    }
    public void defaultReaction(){
        if(!(condition == Condition.sleep)) {
            if (condition == Condition.angry) {
                System.out.println("Вас поцарапали");
            } else {
                System.out.println("Мяу");
            }
        }
    }
    @Override
    public void eat(){
        if(condition == Condition.angry){
            condition = Condition.good;
        }
    }

    @Override
    public void move() {
        System.out.println("Котик ушёл по свои кошачьим делам");
    }

    @Override
    public void reaction() {
        System.out.println("не реагирует");
    }

    public void wakeUp(){
        condition = Condition.angry;
        System.out.println("Кошка проснулась");
    }

    public void purr(Human h){
        if(h.sex == Sex.man) System.out.println("Мурлычет как паровоз");
                else{System.out.println("Мурлычет");
                }
    }
}
