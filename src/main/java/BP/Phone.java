package BP;

public class Phone {
    // w klasie Phone zadnych setterow - tylko konstruktor

    public Phone(String os, int ram, String processor, double screenSize, int battery) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;

}
