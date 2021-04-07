package TemaIfElse;

public class LogicalOp {

    //Pentru a testa aceasta metoda, mergeti in metoda main(), din clasa Main,
    // si construiti un obiect de tip LogicalOp, si apelati metoda cu valori.
    // Fiind o metoda de tip int, ea va returna o valoare, pe care noi trebuie sa o prindem
    // si ca sa o vedem, trebuie sa o afisam in consola.
    public int checkBiggerNumber(int first, int second){
       if (first > second){
           return first;
       }else {
           return second;
       }
   }
//Creati o metoda de tip String, care sa primeasca un parametru de tip String.
// Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”.
// Daca da, atunci metoda sa returneze “Learning text comparison”.
// Daca nu, atunci metoda sa returneze “Got to try some more”.
   String text = "text";
   public String checkText(String text){
       if (text.equals("FastTrackIT")){
           System.out.println("Learning text comparison");
       }else if (!text.equals("FastTrackIT")){
           System.out.println("Got to try some more");
       }

       return text;
   }

//Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
// Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic sau egal cu 3,
// returnati textul si numarul, in ordinea asta.
// Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta.
// Apelati metoda in main() pentru a verifica daca functioneaza.


    public String stringNumber(String text, int number){
       if (text.equals("FastTrackIT")&& number <=4) {
           return (text +   number);
       }else if (!text.equals("FastTrackIT") && number>=4){
           return (number +   text);
       }
        return "";
    }
    //6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
    // Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “
    // si numarul.
    // Daca nu, sa printeze “The forecast snow is(cm):” si numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String snowAmount(int number){
       if (number > 8 || number == 6){
           System.out.println("The amount of snow this winter was(cm): "+ number);
       }else {
           System.out.println(" The forecast snow is(cm): " +number);
       }
       return "";
    }
    //7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
    // Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
    // Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String greaterLower(int number){
       if (number > 3 || number != 4){
           System.out.println("The number is greater than 3 and not equal to 4");
       } if ( number == 4){
           System.out.println("The number is equal to 4");
       }else if (number < 3){
           System.out.println("The number is lower than 3");
       }
        return "";
    }
    //8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    //Folosind constructia Switch-Case,
    //verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie sa reprezinte numarul apasat.
    // Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
    // "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int showDay(int number){
       int day = number;
       switch (day){
           case 1:
               System.out.println("Today is monday");
               break;
           case 2:
               System.out.println("Today is Tuesday");
               break;
           case 3:
               System.out.println("Today is Wednesday");
               break;
           case 4:
               System.out.println("Today is Thursday");
               break;
           case 5:
               System.out.println("today is Friday");
               break;
           default:
               System.out.println("Weeekeeeend!!!");


       }

        return day;
    }
    //9. Creati o metoda care sa se numeasca isNumberEven.
    // Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
    // Daca numarul e par sa returneze true iar daca e impar sa returnese false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String isNumberEven(int number){
       if (number % 2 == 0){
           System.out.println("True");
       } else if (number % 2 !=0) {
           System.out.println("False");

       }
       return "";
    }
    //10. Creati o metoda care sa se numeasca isEligibleToVote.
    // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public String isEligibleToVote(int number){
       if (number > 18){
           System.out.println("True");
           }else if (number < 18){
               System.out.println("False");
           }
           return"";

    }
    //11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int maxofthree(int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > third) {
            return second;
        } else {
            return third;
        }





     }




}
