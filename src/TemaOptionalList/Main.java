package TemaOptionalList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

        List<String> myStrList = new ArrayList<>();
        myStrList.add("masina");
        myStrList.add("mobila");
        myStrList.add("animal");
        myStrList.add("haine");
        myStrList.add("casa");

        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(2);
        myIntList.add(3);
        myIntList.add(1);
        myIntList.add(9);
        myIntList.add(12);

//1
        //op.changePosition(myStrList);
//2
        //System.out.println(op.evenNum(myIntList));
//3
        System.out.println(op.sortNumbers(myIntList));













    }
}
