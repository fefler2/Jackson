package SpringDi;

import org.springframework.stereotype.Service;

@Service
public class Calc {
    int add(int a, int b){
        return a+b;
    }
}
