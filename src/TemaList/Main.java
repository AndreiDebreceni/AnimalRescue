package TemaList;

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
        myIntList.add(6);
        myIntList.add(9);
        myIntList.add(12);


//1.

        //op.getList(myStrList);

//2

        //op.addToList(myIntList,11);

//3
        //op.addToList2(myIntList, 27);
//4
        //op.invertList(myStrList);
//5
        //op.addToPozition(myStrList, 3, "autobus");
//6
        //op.addToFirstPoz(myStrList, "autobus");
//6
        //op.showPozElement(myStrList);
//7
        System.out.println(op.getBigNum(myIntList));

















    }
}
