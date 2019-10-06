package com.github.arolfes.codewars;

import lombok.Builder;
import lombok.Getter;

/**
 * https://www.codewars.com/kata/lombok-builder/train/java
 *
 */
@Builder
@Getter
public class People {

  private static final String GREET = "hello my name is ";

  private int age;
  private String name;
  private String lastName;
  private String city;
  private String job;

  public String greet() {
    return GREET + name;
  }

}
