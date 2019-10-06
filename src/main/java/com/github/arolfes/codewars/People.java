package com.github.arolfes.codewars;

/**
 * https://www.codewars.com/kata/lombok-builder/train/java
 *
 */
public class People {

  private static final String GREET = "hello my name is ";

  private int age;
  private String name;
  private String lastName;
  private String city;
  private String job;

  public People(int age, String name, String lastName, String city, String job) {
    this.age = age;
    this.name = name;
    this.lastName = lastName;
    this.city = city;
    this.job = job;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCity() {
    return city;
  }

  public String getJob() {
    return job;
  }

  public String greet() {
    return GREET + name;
  }

  public static PeopleBuilder builder() {
    return new PeopleBuilder();
  }

  public static class PeopleBuilder {

    private int age;
    private String name;
    private String lastName;
    private String city;
    private String job;

    public PeopleBuilder name(String name) {
      this.name = name;
      return this;
    }

    public PeopleBuilder age(int age) {
      this.age = age;
      return this;
    }

    public PeopleBuilder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public PeopleBuilder city(String city) {
      this.city = city;
      return this;
    }

    public PeopleBuilder job(String job) {
      this.job = job;
      return this;
    }

    public People build() {
      return new People(age, name, lastName, city, job);
    }
  }
}
