package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FifthItemTest {

    @Test
    void testFifthItem() {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        assertEquals("fifth", list.get(4), "The fifth item should be 'fifth'");
    }

    @Test
    void testLessThanFiveItems() {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(4);
        }, "Should throw IndexOutOfBoundsException when there are less than 5 items");
    }
}
