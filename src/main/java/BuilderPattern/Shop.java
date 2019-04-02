package BuilderPattern;


public class Shop {
    public static void main(String[] args) {
        Phone p2 = new PhoneBuilder().setOs("Android").getPhone();
    }
}
