package sem7hw;

public class LandlinePhone extends Phone {

    private int number;


    public LandlinePhone(String brand, String model, Microphone micro, Speaker speaker, int number) {
        super(brand, model, micro, speaker);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void call() {
        System.out.println("Звонок стационарного телефона");
    }

    @Override
    public void receiveCall() {
        System.out.println("Звонок на стационарный принят");
    }
}
