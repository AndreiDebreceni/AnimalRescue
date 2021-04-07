package com.company;

public class Dog {

    private String breed ;
    private String name;
    private int age;
    private String color;
    private float weight;
    private int heightInCm;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }


    public void setHeightInCm(int heightInCm){
        this.heightInCm = heightInCm;
    }
    public int getHeightInCm(){
        return heightInCm;
    }


    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }


    public void setWeight(int weight){
        this.weight = weight;
    }
    public int getWeight(){
        return (int) weight;
    }



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