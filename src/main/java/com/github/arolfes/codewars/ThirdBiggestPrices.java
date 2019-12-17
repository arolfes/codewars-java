package com.github.arolfes.codewars;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ThirdBiggestPrices {


  public static int getThirdBiggestValue(List<Integer> prices) {
    Collections.sort(prices);
    List<Integer> resultList = prices.stream().distinct().collect(Collectors.toList());
    if (resultList.size() >= 3) {
      return resultList.get(resultList.size() - 3);
    }
    return resultList.get(0);
  }
}
