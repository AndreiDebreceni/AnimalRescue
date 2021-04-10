package AnimalRescue;

import AnimalRescue.objects.HumanObj;

public class Veterinarian extends HumanObj {

    String name = "Doctor";

    int drugs = 1;
    int drugsprice = 10;
    int vaccineprice = 20;

    public void givedrugs(int value){ drugsprice *=value; }

}
