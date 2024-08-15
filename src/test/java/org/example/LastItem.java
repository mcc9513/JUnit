package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class LastItemTest {

    @Test
    void testLastItem() {
        ArrayList<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        assertEquals("third", list.get(list.size() - 1), "The last item should be 'third'");
    }

    @Test
    void testEmptyList() {
        ArrayList<String> list = new ArrayList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(list.size() - 1);
        }, "Should throw IndexOutOfBoundsException when accessing last item of an empty list");
    }
}
