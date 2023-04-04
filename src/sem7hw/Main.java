package sem7hw;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Apple","6xyz", new Microphone(), new Speaker());
        smartphone.getMicro().record();
    }
}
