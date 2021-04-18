package TemaArrayOptional;


import TemaIfElse.LogicalOp3;

import java.util.Arrays;

public class LogicalOp {
    //1. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.

    public int[] insertTo(int[] insert, int number, int position){
        for (int i = 0; i < insert.length; i++){
            insert[position] = number;
            System.out.println(insert[i]);
        }
        return insert;


    }
    LogicalOp3 op3 = new LogicalOp3();

    //2. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.

    public void arrMaxMin(int[] arrMaxMin){
        int smallest = arrMaxMin[0];
        int biggest = arrMaxMin[0];


        for(int i=1; i< arrMaxMin.length; i++)
        {
            if(arrMaxMin[i] > biggest)
                biggest = arrMaxMin[i];
            else if (arrMaxMin[i] < smallest)
                smallest = arrMaxMin[i];

        }
        System.out.println("" + biggest + " " + smallest);




    }

    //3. Creati o metoda care sa inverseze valorile unui array de int-uri.

    public void reverseArr (int[] reverseArr){
        for(int i=0; i<reverseArr.length / 2; i++){
            int temp = reverseArr[i];
            reverseArr[i] = reverseArr[reverseArr.length -i -1];
            reverseArr[reverseArr.length -i -1] = temp;
        } for (int i = 0; i < reverseArr.length; i++) {
            System.out.println(reverseArr[i]);

        }

    }

    //4. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.

        public void findDup (int[] findDup) {
            for (int i = 0; i < findDup.length; i++) {
                for (int j = i + 1; j < findDup.length; j++) {
                    if (findDup[i] == (findDup[j])) {
                        System.out.println(findDup[i]);
                    }
                }
            }

    }

    //5. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).

    public void findCommon(int[] common1,int[]common2) {
        for (int i = 0; i < common1.length; i++) {
            for (int j = 0; j < common2.length; j++) {
                if (common1[i] == (common2[j])) {

                    System.out.println("Common element are : " + (common1[i]));
                }
            }
        }


    }
    //6. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.

    public void ordonate(int[]ordonate){
        for(int i = 0; i < ordonate.length; i++){
            Arrays.sort(ordonate);
            System.out.println(ordonate[i]);
        }




    }

}
