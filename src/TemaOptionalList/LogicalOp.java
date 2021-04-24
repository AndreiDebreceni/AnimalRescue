package TemaOptionalList;

import java.util.Collections;
import java.util.List;

public class LogicalOp {

    //1 Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista,

    public void changePosition(List l){
        System.out.println("inainte de schimbarea pozitiilor :" + l);
        Collections.swap(l, 0, 3);
        System.out.println("dupa schimbarea pozitiilor: " +l);
    }

    //Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista,
    // care sa contina doar numerele pare din lista primita.

    //public int evenNum(List list){
       // List<Integer> l = new ArrayList<>();
       // for (Integer  : list) {
            //if (Integer  % 2 == 0) {

          //  } return l;

    //Scrieti o metoda Java care sa primeasca parametru o Lista nesortata,
    // si sa returneze Lista sortata crescator.

    public List sortNumbers(List l){
        for(int i=0; i<l.size();i++ ) {
            Collections.sort(l);
        }
        return l;
    }


































}
