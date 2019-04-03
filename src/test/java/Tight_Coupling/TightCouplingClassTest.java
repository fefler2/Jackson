package Tight_Coupling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TightCouplingClassTest {

    @Test
    void multiply() {
        TightCouplingClass tightCouplingClass =
                new TightCouplingClass();
        assertEquals(22, tightCouplingClass.multiply(2,11));
    }
}