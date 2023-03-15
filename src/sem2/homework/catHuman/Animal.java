package sem2.homework.catHuman;

public abstract class Animal {
    private int age;
    private String name;

    private int fatigue;

    public int getFatigue() {
        return fatigue;
    }

    public void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        this.fatigue = 10;
    }

    @Override
    public String toString() {
        return String.format("%s.%d",name,fatigue);
    }
}
