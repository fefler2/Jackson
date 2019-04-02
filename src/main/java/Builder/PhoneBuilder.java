package Builder;

public class PhoneBuilder {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

    public void PhoneBuilder (String os) {
        this.os = os;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
    }
}
