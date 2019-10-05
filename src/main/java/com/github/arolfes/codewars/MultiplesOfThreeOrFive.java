package com.github.arolfes.codewars;

public class MultiplesOfThreeOrFive {

  public int solution(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
      if (isModuloThree(i) || isModuloFive(i)) {
        sum += i;
      }
    }
    
    return sum;
  }
  
  private boolean isModuloThree(int num) {
    return num % 3 == 0;
  }
  private boolean isModuloFive(int num) {
    return num % 5 == 0;
  }
  
}
