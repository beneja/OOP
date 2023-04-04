package sem7hw;

import java.util.Random;

public class SatellitePhone extends Phone{
    Random random = new Random();
    private Object antenna;

    public SatellitePhone(String brand, String model, Microphone micro, Speaker speaker, Object antenna) {
        super(brand, model, micro, speaker);
        this.antenna = antenna;
    }

    void checkSignal(){
        System.out.println(random.nextInt(0,101));
    }
    @Override
    public void call() {
        System.out.println("Звонок со спутникового");
    }

    @Override
    public void receiveCall() {
        System.out.println("Принят звонок на спутниковый");
    }
}
