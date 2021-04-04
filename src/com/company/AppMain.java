package com.company;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();

        System.out.println(rex.breed);
        System.out.println(rex.weight);
        rex.eat(1);
        System.out.println(rex.weight);

        Girl anna = new Girl();
        anna.buyfood(20);
        anna.buytreatment(20);

        Food meat = new Food();
        System.out.println(anna.money);

        anna.buyfood(5); meat.exitfood(5);
        System.out.println(meat.stokquantity);

        System.out.println(anna.money);
        anna.buyfood(1);
        System.out.println(anna.money);
        DogActivity recreation = new DogActivity();
        recreation.catchball(3);
        System.out.println(recreation.recreation);


    }
}
