package com.company;

public class Dog {

    String name = "Rex";

    String breed = "Labrador";
    int age = 3;
    String color = "yellow/brown";
    float weight = 15.4f;
    int heightInCm = 35;


    public void bark(){
        System.out.println("Ham!");
    }

    public void eat(int value){
        weight +=value;
    }

    public void sleep(){
        System.out.println("ZzzZZzz snores");
    }

}