package TemaArray;

public class Calculator {

    //In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului polimorfismului.
    // Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.
    //Spre exemplu, pentru metoda de adunare, faceti ca aceasta sa lucreze o data cu 2 int-uri,
    // o data cu 2 float-uri, cu 3 float-uri, cu 4 int-uri, etc. Atentie ce returnati la final!

    public int calculare(int first, int second){
        int sum = 0;
        sum+= first + second;
        return sum;
    }
    public float calculare(float first, float second){
        float sum = 0;
        sum+= first + second;
        return sum;
    }
    public float calculare(float first, float second,float third){
        float sum = 0;
        sum+= first + second + third;
        return sum;
    }
    public int calculare(int first, int second,int third, int fourth){
        int sum = 0;
        sum+= first + second + third + fourth ;
        return sum;
    }


}
