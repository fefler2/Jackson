package Usunac2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.mock;

class Class1Test {

    Class1 class1;

    @BeforeEach
    public void init(){
        class1 = new Class1();
    }

    @Test
    void add() {
        Class1 mockObject = mock(Class1.class);
        assertEquals(23, class1.add(11,12));
    }
}