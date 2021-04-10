package TemaFor;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
//1.
        int number = 80;
        op.countTo100(number);
//2.
        int numberMinus = -80;
        op.countToMinus100(numberMinus);
//3.
        op.countFromXtoY(10,8);
//4.
        op.countFromlower(10,7);
//5.
        op.showEven(1,100);
//6.
        op.showOdd(1,100);
//7.
        System.out.println("Sum of number is: "+op.sumOfNumbersFromXto100(1));
//8.
        System.out.println("Med of numbers id: "+op.medOfNumbersFromXto100(1));
//9.
        op.nestLoop();
    }
}
