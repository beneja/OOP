package sem7hw;

public abstract class Phone implements MakeCall, ReceiveCall{
    private String brand;
    private String model;
    private Microphone micro;
    private Speaker speaker;

    public Phone(String brand, String model, Microphone micro, Speaker speaker) {
        this.brand = brand;
        this.model = model;
        this.micro = micro;
        this.speaker = speaker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Microphone getMicro() {
        return micro;
    }

    public void setMicro(Microphone micro) {
        this.micro = micro;
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
