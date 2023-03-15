package sem2.homework.catHuman;

public class Cat extends Animal implements BaseAction, CreatureAction {

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void eat(){
        this.setFatigue(this.getFatigue()+2);
        System.out.println("Кошка поела");
    }

    @Override
    public void move() {
        this.setFatigue(this.getFatigue()-1);
    }

    @Override
    public void reaction() {
        System.out.println("мяу");
    }

    public void purr(Human h){
        if(h.sex == Sex.man) System.out.println("Мурлычет как паровоз");
                else{System.out.println("Мурлычет");
                }
    }
}
