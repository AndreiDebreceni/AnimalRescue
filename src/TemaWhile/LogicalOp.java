package TemaWhile;

import TemaIfElse.LogicalOp3;

public class LogicalOp {


    //1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void fromXto100(int num){
        int num2 = 100;
        while (num <= num2){
            System.out.println(num);
            num++;
        }
    }
    //2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void fromXtoMinus100(int num1){
        int num2 = -100;
        while (num1 >= num2){
            System.out.println(num1);
            num1--;
        }
    }
    //3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite,
    // pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void fromXtoY(int first, int second){
        while (first < second){
            System.out.println(first);
            first++;
        }if (first >= second) {
            while (first >= second) {
                System.out.println(second);
                second++;
            }
        }
    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void fromLowtoHigh(int low, int high){
        LogicalOp3 op = new LogicalOp3();
        int lowest = op.getLowerNumber(low,high);
        int higher = op.getHigherNumber(low,high);
        while (lowest<=higher){
            System.out.println(lowest);
            lowest++;
        }
    }
    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void evenFrom1to100(){
        int i = 2;
        int j = 100;
        while(i<=j){
            System.out.println(i);
            i=i+2;
        }
    }
    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100
    public void oddFrom1to100() {
        int i = 1;
        int j = 100;
        while (i <= j) {
            System.out.println(i);
            i = i + 2;
        }
    }
    //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void sumMed(){

        int num = 8899, i = 111, sum = 0;
        double count = 0;
        while(i <= num) {
            sum += i;
            i++;
            count++;
        }

        System.out.print("Suma numerelor este " + sum);
        System.out.println(" iar media numerelor este " +39594445f/count);
    }
    //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public float medDiviz7(int first, int second){
        double sum = 0, count = 0;
        while (first <= second){
            sum += first % 7;
            first++;
            count++;

        }
        return (float) (+sum/count);
    }
    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void fibonacci() {

        int i = 1, n = 20, t1 = 0, t2 = 1;
        System.out.println("Primele 20 de numere ale lui Fibonacci sunt: ");
        while (i <= n) {
            System.out.print(" " + t1);
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }
    }
    //10. Creati o metoda numita CozaLozaWoza.
    public void cozaLozaWoza(){
        int i = 1;

        while (i <= 110) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                test = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                test = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                test = true;
            }
            if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }


}

