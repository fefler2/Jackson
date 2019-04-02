package Builder;

public class Shop {


    public static void main(String[] args) {
//        Phone p = new Phone("Android", 2,"Qualcom",
//                5.5, 3100);
//        System.out.println(p);

        // potrzebne sa tylko nazwa OS i RAM
        Phone p2 = new PhoneBuilder().setOs("Android")
                .setRam(2).getPhone();

    }

}
