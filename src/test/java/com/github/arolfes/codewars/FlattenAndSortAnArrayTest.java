package com.github.arolfes.codewars;

import org.junit.Test;
import org.junit.Assert;

public class FlattenAndSortAnArrayTest {

  @Test
  public void testFlattenAndSort() throws Exception {
    Assert.assertArrayEquals(new int[]{}, FlattenAndSortAnArray.flattenAndSort(new int[][]{}));
    Assert.assertArrayEquals(new int[]{1}, FlattenAndSortAnArray.flattenAndSort(new int[][]{{}, {1}}));
    Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, FlattenAndSortAnArray.flattenAndSort(new int[][]{{3, 2, 1}, {7, 9, 8}, {6, 4, 5}}));
    Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 100}, FlattenAndSortAnArray.flattenAndSort(new int[][]{{1, 3, 5} ,{100}, {2, 4, 6}}));
    Assert.assertArrayEquals(new int[]{111, 222, 333, 444, 555, 666, 777, 888, 999}, FlattenAndSortAnArray.flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}}));
  }

}
