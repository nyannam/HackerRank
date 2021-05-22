import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scan.nextInt();
        factorial(number);

    }

    private static int factorial(int number) {
        int factorial=1;
        for(int i=1;i<=number;i++){
             factorial = factorial * i;
        }
        System.out.println("factorial for " + number + " is " +factorial);
        return factorial;
    }

}
