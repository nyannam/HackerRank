import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Please enter the number");
        int number = scan.nextInt();
        primeChecker(number);

    }

    private static void primeChecker(int number) {
        boolean isPrime=true;
        for(int i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(number + " is a prime number ");
        }
        else
            System.out.println(number + " is not a prime number");
    }

}
