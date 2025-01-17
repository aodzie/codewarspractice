package com.codewars;

import org.junit.jupiter.api.*;
import java.util.*;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

/*
These are copied from Codewars, not written by me.
 */

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MinMaxTest {

    private final List<Integer> getNewRandomList(int size) {
        return (new Random()).ints(size, 0, 50).boxed().collect(Collectors.toList());
    }

    private final int[] _s(List<Integer> list) {
        return new int[]{ Collections.min(list), Collections.max(list) };
    }

    private final void doTest(List<Integer> list) {
        int[] ref = _s(list);
        int[] actual = MinMax.getMinMax(list);

        assertArrayEquals(
                ref,
                actual,
                "input: " + list.toString() + "\n" +
                        "expected: " + Arrays.toString(ref) + "\n" +
                        "your result: " + Arrays.toString(actual) + "\n"
        );
    }

    @Test
    @Order(1)
    @DisplayName("Fixed Tests")
    final void fixedTests() {
        assertArrayEquals(new int[] {1, 1}, MinMax.getMinMax(Arrays.asList(1)),     "input: [1]");
        assertArrayEquals(new int[] {1, 2}, MinMax.getMinMax(Arrays.asList(1, 2)),  "input: [1, 2]");
        assertArrayEquals(new int[] {1, 2}, MinMax.getMinMax(Arrays.asList(2, 1)),  "input: [2, 1]");
    }

    @Test
    @Order(2)
    @DisplayName("Random Tests (100 random lists)")
    final void randomTests() {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            doTest(getNewRandomList(1 + r.nextInt(25)));
        }
    }
}