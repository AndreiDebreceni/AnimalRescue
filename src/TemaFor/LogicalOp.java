package TemaFor;

import TemaIfElse.LogicalOp3;

public class LogicalOp {

    LogicalOp3 op=new LogicalOp3();

    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void countTo100(int number){
        for(int num = number; num<=100; num++){
            System.out.println(num);
        }

    }
    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void countToMinus100(int number){
        for(int num = number; num>=-100;num-- ){
            System.out.println(num);
        }
    }
    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void countFromXtoY(int start, int finish){
        if (start<=finish) {
            for (start = start; start <= finish; start++)
                System.out.println(start);
        }else if (start >= finish) {
            for (start = start; start >= finish; start--) {
                System.out.println(start);
            }
        }

    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

     public void countFromlower(int start1, int finish1){
         if(start1<=finish1) {
             for (start1 = start1; start1 <= finish1; start1++)
                 System.out.println(start1);
         }else if (start1>=finish1) {
             for(finish1 = finish1; finish1 <= start1; finish1++){
                 System.out.println(finish1);
             }
         }


     }
     //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void showEven(int no1, int no2){
        for (no1 = no1; no1 <= no2; no1++){
            if (no1 % 2 == 0){
                System.out.println(no1);
            }
        }

    }
    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void showOdd(int impar1, int impar2){
        for (impar1 = impar1; impar1 <= impar2; impar1++){
            if (impar1 % 2 != 0){
                System.out.println(impar1);
            }
        }

    }
    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza

    public int sumOfNumbersFromXto100(int fromNo1){
        int toNo2 = 100;
        int sum = 0;
        for (fromNo1=fromNo1; fromNo1<=toNo2; fromNo1++){
          //sum = sum + i;
            sum+=fromNo1;
        }
        return+sum;
    }
    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor.
    // La final, metoda sa returneze media. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public float medOfNumbersFromXto100(int medNum){
         double count = 0;
         double medNum2 = 100;
         double sum = 0;
        for (medNum = medNum; medNum <= medNum2; medNum++){
            count++;
            sum+=medNum;


        }
        return (float) (sum/count);
    }
    //9.Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    //*******
    //******
    //*****
    //****
    //***
    //**
    //*

    public void nestLoop(){
        int size = 6;

        for (int j = 0; j <= size; j++)
        {
            for (int i = size; i >= j; i--)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
