package TryCatchFinally;

import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;


public class ReadInput {

    //1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.

    public int getInt(Scanner scan) {
        int keyboard = 0;
        boolean repeat = false;
        do {
            System.out.print("Enter a number: ");
            try {
                scan = new Scanner(System.in);
                keyboard = scan.nextInt();
                repeat = false;
                System.out.println("The number is :" + keyboard);

            } catch (InputMismatchException e) {
                repeat = true;
                System.out.println("NAN , try again... ");
            }


        } while (repeat == true);
        return keyboard;

    }

    //2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
    // care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)


    //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
    // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public void populateArray(int[] myArray, int number) {
        boolean repeat = false;
        do {
            System.out.print("Enter  " + number + "  elements :");
            int[] a = new int[number];
            Scanner scan = new Scanner(System.in);
            try {
                for (int j = 0; j < number; j++)
                    a[j] = scan.nextInt();
                System.out.println("Array elements are : ");
                for (int i = 0; i < a.length; i++)
                    System.out.println(a[i]);
                repeat = false;
            } catch (InputMismatchException e) {
                repeat = true;
                System.out.println("Add only numbers...try again ");
            }
        } while (repeat == true);
    }

    //4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
    // Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
    // (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)

    public List<Integer> addToList(List<Integer> l) {
        boolean repeat = false;
        do {
            System.out.print("Add first element: ");
            try {
                Scanner scan = new Scanner(System.in);
                int a = scan.nextInt();
                l.add(a);
                System.out.print("Add second element: ");
                int b = scan.nextInt();
                l.add(b);
                System.out.print("Add third element: ");
                int c = scan.nextInt();
                l.add(c);
                System.out.print("Add the last element: ");
                int d = scan.nextInt();
                l.add(d);
                repeat = false;
                return l;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Add only numbers...try again "); }
        } while ( repeat == true);

        return l;
    }
    // In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
    // Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
    // iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".

    public void getIndex(int[] arrayList , int number) {
        boolean repeat = false;


            try {
                int index = number;
                System.out.println(arrayList[number]);
                repeat = false;
            } catch (ArrayIndexOutOfBoundsException error) {
                repeat = false;
                System.out.print("Inside catch, number too large");
            }

        }
        //6. In clasa LogicalOp, creati o metoda  'wait()'.
    // Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int.
    // In interiorul ei, tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte.
    // Ex: wait(5) -> asteapta 5 secunde.
    //Mentiune: metoda Thread.sleep() se foloseste de milisecunde pentru a astepta.

    public void wait(int number) throws InterruptedException {
        Thread.sleep(number);
        System.out.println("Am asteptat 5 secunde");
    }





}