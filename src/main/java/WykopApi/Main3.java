package WykopApi;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Main3 {
    public static void main(String[] args) {
//        try {
//            Client klient = Client.create();
//            WebResource webZrodlo =
//                    klient.resource
//                            ("https://a2.wykop.pl/Hits/Popular/");
//            ClientResponse webOdpowiedz = webZrodlo.accept("application/json")
//                    .get(ClientResponse.class);
//
//            if (webOdpowiedz.getStatus() != 200) {
//                throw new RuntimeException("Blad HTTP ...." + webOdpowiedz.getStatus());
//            }
//            String pobranyJson = webOdpowiedz.getEntity(String.class);
//            System.out.println(pobranyJson);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }

        try {
            // tworzenie klienta
            // chyba builder
            Client client = Client.create();
            String u;
            WebResource webResource = client.resource("https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=API_KEY\n");
            String s = webResource.get(String.class);
            System.out.println(s);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
