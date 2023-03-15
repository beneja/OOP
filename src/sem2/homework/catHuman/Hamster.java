package sem2.homework.catHuman;

public class Hamster extends Animal implements BaseAction, CreatureAction {

    public Hamster(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat(){
        this.setFatigue(this.getFatigue()+2);
        System.out.println("Хомяк поел");
    }

    @Override
    public void reaction() {
        System.out.println("звуки хомяка");
        if (this.getFatigue() < 5){
            System.out.println("звуки уставшего хомяка");
        }
    }

    @Override
    public void move() {
        this.setFatigue(this.getFatigue()-1);
    }
}
