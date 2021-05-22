import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number = scan.nextInt();
        numberPalindrome(number);
    }

    public static void numberPalindrome(int number) {
        int temp = number;
        int reverse=0,lastDigit=0;
        while(number>0){
            lastDigit = number%10;
            number = number/10;
            reverse = (reverse*10)+lastDigit;
        }
        if(temp==reverse) {
            System.out.println(number+ "is palindrome");
        }
        else
            System.out.println(number+ "not a palindrome");
    }
}
