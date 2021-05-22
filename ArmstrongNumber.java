import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int number = scan.nextInt();
        armStrongNumber(number);
    }

    private static void armStrongNumber(int number) {
        int temp=number;
        int lastDigit=0;
        int sum=0;
        while(number>0) {
            lastDigit = number%10;
            number = number/10;
            sum = sum + (lastDigit*lastDigit*lastDigit);
        }
           if(temp==sum) {
               System.out.println("is Armstrong number");
           }
            else
           {
               System.out.println("not an armstrong number");
           }
    }

}
