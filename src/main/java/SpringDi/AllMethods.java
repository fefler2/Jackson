package SpringDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllMethods {
    @Autowired
    Calc calc;

    @GetMapping
    public String getNumber(){
        int a = calc.add(2,3);
        return String.valueOf(a);
    }




}
