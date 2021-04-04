package com.company;

public class Food {

    String name = "Meat";

    int meatprice = 20;
    int meatquantity = 1;
    int stokquantity = 5000;

    public void exitfood(int value){stokquantity *= value; }
}
