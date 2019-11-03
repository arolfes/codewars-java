package com.github.arolfes.codewars;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseWordTest {

    @Test
    public void testSolution() throws Exception {
        assertEquals("dlrow", ReverseWord.solution("world"));
    }

}
