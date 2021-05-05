package TryCatchFinally;

import java.util.Scanner;

public class PrintArray {



    public void populateArray(int[] myArray){
        ReadInput read = new ReadInput();
        int[] a=new int[6];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter elements...");
        for(int j=0;j<6;j++)
            a[j]=scan.nextInt();
        System.out.println("Array elements are : ");
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
