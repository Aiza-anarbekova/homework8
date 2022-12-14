package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class Horse implements Animal {
    @Value("${horse.name}")
    private String name;
    @Value("${horse.age}")
    private int age;
    @Value("${horse.breed}")
    private String breed;

    public Horse() {
    }

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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void animalPlus() {
        System.out.println(getName()+" "+getAge());
        System.out.println("bystro begaet");

    }

    @Override
    public void animalMinus() {
        System.out.println("minusov netu");

    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
