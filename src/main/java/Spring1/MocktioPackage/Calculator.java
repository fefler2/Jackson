package Spring1.MocktioPackage;


class CalculatorService {
    int add(int a, int b) {
        return a + b;
    }
}

// jest api, ktore jest powiazane
public class Calculator {


    public Calculator(CalculatorService service) {
        this.service = service;
    }

    CalculatorService service;
//    CalculatorService service = new CalculatorService();
// w tym przypadku bledu by nie bylo i daloby rade obejsc sie
// bez mockito, ale trzeba byloby uzyc obiektu

    public int perform(int i, int j) {
        return service.add(i, j) * i;
    }


}
