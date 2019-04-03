package Loose_Coupling;

public final class Box {
    private int volume;

    public int add(int a, int b){
        return a+b;
    }

    public int getVolume() {
        return volume;
    }

    public Box(int length, int width, int height) {
        this.volume = length * width * height;
    }

}
