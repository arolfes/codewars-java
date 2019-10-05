package com.github.arolfes.codewars;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MultiplesOfThreeOrFiveTest {

  @Test
  public void testSolution() throws Exception {
    assertEquals(23, new MultiplesOfThreeOrFive().solution(10));
  }

}
