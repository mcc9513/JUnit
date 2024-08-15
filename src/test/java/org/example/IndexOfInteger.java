package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class IndexOfIntegerTest {

    @Test
    void testIndexOfNumberInList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(1, list.indexOf(20), "The index of 20 should be 1");
    }

    @Test
    void testNumberNotInList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(-1, list.indexOf(40), "If the number is not in the list, the index should be -1");
    }
}
