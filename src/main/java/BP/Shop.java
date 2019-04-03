package BP;

public class Shop {
    public static void main(String[] args) {
        // Phone, a nie PhoneBuilder
        Phone phone = new PhoneBuilder().setOs("A").getPhone();
    }
}
