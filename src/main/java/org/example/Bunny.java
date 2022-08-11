package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Bunny implements Animal {
    @Value("${bunny.name}")
    private String name;
    private String color;
    @Value("${bunny.age}")
    private int age;

    public Bunny() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void animalPlus() {
        System.out.println(getName()+" "+getAge());
        System.out.println("prygaet");

    }

    @Override
    public void animalMinus() {

        System.out.println("minusov netu)");

    }
}
