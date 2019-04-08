package Spring1.MocktioPackage;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;
import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.BDDMockito.*;
//import static org.mockito.Mockito.mock;

class ATest {

    @Mock
    A a;


    @Test
    public void simpleExampleHowToUseMockito()
            throws Exception {
        ArrayList arrayList  = mock(ArrayList.class);
        given(arrayList.get(0)).willReturn("hello world");

        System.out.println(arrayList.get(0));

    }

}