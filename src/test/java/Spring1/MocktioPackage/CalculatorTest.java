package Spring1.MocktioPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = null;

    @BeforeEach
    public void init(){
        calculator = new Calculator();

    }

    @Test
    void add() {

        assertEquals(10, calculator.perform(2,3));

    }
}