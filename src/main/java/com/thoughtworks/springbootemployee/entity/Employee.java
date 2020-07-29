package com.thoughtworks.springbootemployee.entity;

public class Employee {
    private String gender;
    private int id;
    private int age;
    private String name;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(String gender, int id, int age, String name) {
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Employee() {
    }
}
