package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Person {
    private  Animal animal;
    private Animal animal1;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public Person(@Qualifier("horse") Animal animal,
                 @Qualifier("bunny")
                 Animal animal1)
    {
        this.animal = animal;
        this.animal1=animal1;
    }

    public Person() {
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
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
    public void personInfo(){
        System.out.println(getName()+" "+getAge());
        animal1.animalPlus();
        animal1.animalMinus();
        animal.animalPlus();
        animal.animalMinus();
    }
}
