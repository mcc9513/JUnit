package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class HowLongTest {

    @Test
    void testListLength() {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        assertEquals(3, list.size(), "The length of the list should be 3");
    }

    @Test
    void testEmptyList() {
        ArrayList<String> list = new ArrayList<>();

        assertEquals(0, list.size(), "The length of the list should be 0");
    }
}

