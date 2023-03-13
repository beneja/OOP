package sem2.homework.catHuman;

public class Hamster extends Animal implements BaseAction, CreatureAction {
    private int fatigue;
    public Hamster(String name,int age,int fatigue) {
        super(name,age);
        this.fatigue = fatigue;
    }
    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    @Override
    public void eat() {
    this.fatigue = fatigue + 3;
    }

    @Override
    public void reaction() {
        System.out.println("звуки хомяка");
        if (this.fatigue < 5){
            System.out.println("звуки уставшего хомяка");
        }
    }

    @Override
    public void move() {
        System.out.println("Крутит колесо");
        this.fatigue = fatigue - 2;
    }
}
