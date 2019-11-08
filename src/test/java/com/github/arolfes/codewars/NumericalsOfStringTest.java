package com.github.arolfes.codewars;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NumericalsOfStringTest {

    @Test
    public void testNumericals_1() throws Exception {
        assertThat(NumericalsOfString.numericals("Hello, World!"), is("1112111121311"));
    }

    @Test
    public void testNumericals_2() throws Exception {
        assertThat(NumericalsOfString.numericals("aaaaaaaaaaaa"), is("123456789101112"));
    }

    @Test
    public void basicTest1() {
        assertEquals("1112111121311", NumericalsOfString.numericals("Hello, World!"));
    }

    @Test
    public void basicTest2() {
        assertThat(NumericalsOfString.numericals("Hello, World! It's me, JomoPipi!"), is("11121111213112111131224132411122"));
    }
    @Test
    public void basicTest3() {
        assertEquals("11121122342", NumericalsOfString.numericals("hello hello"));
    }

}
