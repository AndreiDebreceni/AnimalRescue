package TemaIfElse;

public class Main {
    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();

        int biggest = op.checkBiggerNumber(2,3);
        System.out.println("The bigger number is: "+ biggest);

        String checktext = op.checkText("FastTrack");
        System.out.println(checktext);

        String checkTextNumber = op.stringNumber("FastTrackIT", 3);
        System.out.println(checkTextNumber);

        String snow = op.snowAmount(10);
        System.out.println(snow);

        String greaterLow = op.greaterLower(4);
        System.out.println(greaterLow);

        int whatDayItIs = op.showDay(6);
        System.out.println(whatDayItIs);

        String isNumberEven = op.isNumberEven(13);
        System.out.println(isNumberEven);

        String voteReady = op.isEligibleToVote(17);
        System.out.println(voteReady);

        int highestNo = op.maxofthree(7,10,300);
        System.out.println(highestNo);





    }





}
