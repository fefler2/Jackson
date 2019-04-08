package Spring1.MocktioPackage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatorTest {

    Calculator calculator = null;


    CalculatorService service = mock(CalculatorService.class);


    @BeforeEach
    public void init(){
        calculator = new Calculator(service);

    }


    @Test
    void perform() {

        when(service.add(2,3)).thenReturn(5);
        assertEquals(10, calculator.perform(2,3));


    }
}