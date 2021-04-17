package TemaArray;

import TemaIfElse.LogicalOp3;

import java.util.Arrays;

public class LogicalOp {

//2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
// valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public void getArray(int[] myArray){
        for (int i = 0; i < 100; i++) {
            myArray[i] = i + 1;

        } for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }

    //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
    // si sa il returneze populat cu toate valorile pare de la 1 la 100.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.

    public int[] evenArr(int[] even){
        int j = 0;
        for (int i = 0; i < 100; i++) {
            even[i] = i++;
        if (even[j] == i)
                j++;

        }for (int i = 0; i < even.length; i++){

            System.out.println(even[i]);
        }

        return even;
    }

    //4. Creati o metoda care sa primeasca un parametru de tip array de numere,
    // si sa fie populat cu valori. Metoda sa calculeze si sa returneze media numerelor din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public double getAverage (int[] getAverage){
        double sum = 0;
        for (int i = 0; i< getAverage.length; i++){
            sum+= getAverage[i];
        }
        return sum/getAverage.length;
    }

    //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri,
    // populat cu valori, si un parametru de tip String.
    // Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,
    // iar daca da sa returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean findText(String[] findNumber, String search){
        for (int i = 0; i < findNumber.length; i++){
            if(findNumber[i] == search)
                return true;

        }
        return false;
    }

    //6. Creati o metoda care sa primeasca un parametru de tip array de numere,
    // populat cu valori, si un parametru de tip numar.
    // Metoda sa verifice daca numarul primit se afla in array-ul primit,
    // si daca da, atunci sa returneze pozitia pe care se afla numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int findIndex(int[]findIndex, int number){

        int index=0;
        for(int i=0;i<findIndex.length;i++){
            if(findIndex[i]==number){
                index=i;
            }
        }
        return index;
    }
    //7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
    //
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -
    //
    //- - - - - - - - - -

    public String[][] showPattern(String[][] pattern){
        for(int i = 0; i < 10; i++){

        for(int j = 0; j < 10; j++)
        {
            System.out.printf(" - ", pattern[i][j]);
        }
        System.out.println();
    }
        return pattern;
}

//8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
// Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit,
// fara acel numar. Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean findNumber(int[] findNumber, int searchNum){
        for (int i = 0; i < findNumber.length; i++){
            if(findNumber[i] == searchNum)
                return true;

        }
        return false;
    }

    //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

     LogicalOp3 op3 = new LogicalOp3();

    public int secNumArr(int[]secNumArr){
        int n = secNumArr.length;

        Arrays.sort(secNumArr);// sortare array de la mic la mare

        return secNumArr[1]; //al doilea cel mai mic numar se afla pe pozitia 2 (index 1) in array

    }

    //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
    // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int[] copyArr (int[]copyArr,int[]destination){
        destination = new int[3];
        for (int i = 0; i < copyArr.length; i++){
            destination[i] = copyArr[i];
        }

        return destination;
    }



}

