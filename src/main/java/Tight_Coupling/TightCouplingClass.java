package Tight_Coupling;

public class TightCouplingClass {
    public static void main(String[] args) {
        Box box = new Box(4,5,6);
        System.out.println(box.volume);
    }
    int multiply(int a, int b){
        return a*b;
    }
}
