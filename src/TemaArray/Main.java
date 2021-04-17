package TemaArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//1
        Calculator calc = new Calculator();
        System.out.println(calc.calculare(20,2));
        System.out.println(calc.calculare(23,4));
        System.out.println(calc.calculare(23,4,2));
        System.out.println(calc.calculare(23,4,2,1));

        LogicalOp op = new LogicalOp();

//2
        int[] myArray = new int[100];
        //op.getArray(myArray);

//3
        int[] evenArr  = new int[100];
        //op.evenArr(evenArr);
//4
        int[] getAverage = {1,2,3,4,5};
        //System.out.println(op.getAverage(getAverage));
//5
        String[] findText = {"Car","TV","JAVA","Testing","FastTrack","IT","Phone","Laptop","Dog"};
        String search = "FastTrack";
        //System.out.println(op.findText(findText,search));

//6
        int[] findIndex = {14,7,32,88,65,95};
        int number = 7;
        //System.out.println(op.findIndex(findIndex,number));
//7
        String [][]showPattern = new String[10][10];
        //op.showPattern(showPattern);

//8
        int[] findNumber = {2,3,5,6,7,9,10};
        int searchNum = 1;
        //System.out.println(op.findNumber(findNumber,searchNum));
//9
        int[] secNumArr = {6,3,8,2,4,5};
        //System.out.println(op.secNumArr(secNumArr));

//10
        int[] copyArr = {6,8,3};
        System.out.println(Arrays.toString(copyArr));

    }
}
