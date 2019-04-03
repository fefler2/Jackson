package Loose_Coupling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    @Test
    void add() {
        Box box = new Box(2,3,4);
        assertEquals(11, box.add(20,2));
    }

//    @Test
//    void getVolume() {
//        Box box = new Box(2,3,4);
//        assertEquals(24, box.getVolume());
//    }
}