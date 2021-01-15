package com.tts.pets;
//public class with 4 private instance variables
public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

//empty constructor
public Pet(){
    String name = "";
    int age = 0;
    String location = "";
    String type = "";
}

//constructor passing 3 variables
public Pet(String name, int age, String type){
    this.name = name;
    this.age = age;
    this.type = type;
}
//getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //toString method to test output
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

