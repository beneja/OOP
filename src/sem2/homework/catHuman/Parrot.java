package sem2.homework.catHuman;


public class Parrot extends Animal implements Fly, Say, BaseAction, CreatureAction{
    private String color;

    public Parrot(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void flight() {
        System.out.println("Летает");
    }

    @Override
    public void voice(){
        System.out.println("Рассказал анекдот");
    }

    @Override
    public void eat(){
        this.setFatigue(+2);
        System.out.println("Попугай поел");
    }

    @Override
    public void reaction() {
        System.out.println("Отпусти меня в Африку");
    }

    @Override
    public void move() {
        this.setFatigue(-1);
    }
}
