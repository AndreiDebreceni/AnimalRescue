package TemaWhile;

public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

 //1.
        op.fromXto100(99);
 //2.
        op.fromXtoMinus100(-99);
 //3.
        op.fromXtoY(3,1);
  //4.
        op.fromLowtoHigh(8,6);
  //5.
        System.out.println("Numerele pare de la 1 la 100 sunt: ");op.evenFrom1to100();
  //6.
        System.out.println("numerele impare de la 1 la 100 sunt:");op.oddFrom1to100();
  //7.
        op.sumMed();
  //8.
        System.out.print("suma numerelor divizate cu 7 este: ");
        System.out.println(op.medDiviz7(1,100));
  //9.
        op.fibonacci();
  //10.
        op.cozaLozaWoza();






    }



}
