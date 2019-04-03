package Usunac2;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BcTest {

    @Test
    void add() {
        Bc bc = new Bc();
        assertEquals(5,bc.add(2,3));
        List mockList = mock(List.class);
        when(mockList.get(0)).thenReturn("Mockito");
        Bc bc2 = mock(Bc.class);

    }
}