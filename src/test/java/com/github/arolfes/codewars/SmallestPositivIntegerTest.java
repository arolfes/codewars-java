package com.github.arolfes.codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestPositivIntegerTest {

    @Test
    public void testSolution() throws Exception {
        assertEquals(2, SmallestPositivInteger.solution(new int[] {-1, 3, 1, 0}));
        assertEquals(3, SmallestPositivInteger.solution(new int[] {-3, 4, 1, 2}));
        assertEquals(3, SmallestPositivInteger.solution(new int[] {-1, 0, 1, 2}));
        assertEquals(1, SmallestPositivInteger.solution(new int[] {15, 3, 18, 95}));
        assertEquals(3, SmallestPositivInteger.solution(new int[] {1, 2, 97, 95}));
    }

}
