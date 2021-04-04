package com.company;

public class Veterinarian {

    String name = "Doctor";

    int drugs = 1;
    int drugsprice = 10;
    int vaccineprice = 20;

    public void givedrugs(int value){ drugsprice *=value; }

}
