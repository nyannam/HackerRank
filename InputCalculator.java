import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scan = new Scanner(System.in);
        int sum=0;
        long avg=0;
        int count=0;
        while(true){

            boolean hasNextInt = scan.hasNextInt();
            if(hasNextInt){
               int number= scan.nextInt();
               count++;
               sum+=number;
               avg=sum/count;
            }else{
                System.out.println("sum = " + sum + " avg = " + avg);
                break;
            }
            scan.nextLine();
        }
        scan.close();
    }
}
