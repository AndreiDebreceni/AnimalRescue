package com.company;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("rex");
        rex.setHeightInCm(30);
        rex.setAge(3);
        rex.setColor("blue");
        rex.setWeight(35);
        rex.getWeight();
        System.out.println("Pe catelul meu il cheama "+ rex.getName() + " si are "+ rex
                .getHeightInCm() + " cm inaltime.");








    }
}
