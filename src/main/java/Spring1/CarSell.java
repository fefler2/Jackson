package Spring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarSell {

    @GetMapping("/allegro")
    public String showCars(@RequestParam String auto) {
        return "Samochody: " + auto; // http://localhost:8080/allegro?auto, http://localhost:8080/allegro?auto=wq
    }


}
