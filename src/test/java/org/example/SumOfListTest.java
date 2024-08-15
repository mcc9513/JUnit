package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfListTest {

    @Test
    void testSumOfList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        assertEquals(6, sum, "The sum of the list should be 6");
    }

    @Test
    void testSumOfEmptyList() {
        ArrayList<Integer> list = new ArrayList<>();

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        assertEquals(0, sum, "The sum of an empty list should be 0");
    }
}
