package com.github.arolfes.codewars;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.Arrays;
import org.junit.Test;

public class ThirdBiggestPricesTest {

  @Test
  public void testGetThirdBiggestValue() throws Exception {
    assertThat(
        ThirdBiggestPrices.getThirdBiggestValue(Arrays.asList(5, 3, -1, 5, 10, 11, 11, 12, 12)),
        is(10));
    assertThat(ThirdBiggestPrices.getThirdBiggestValue(Arrays.asList(-2, -1, 1, 0, 2)), is(0));
    assertThat(ThirdBiggestPrices.getThirdBiggestValue(Arrays.asList(-2, -3, -3, -2)), is(-3));
    assertThat(ThirdBiggestPrices.getThirdBiggestValue(Arrays.asList(-2)), is(-2));

  }

}
