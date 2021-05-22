import java.util.Scanner;

//This code is not working as expected. please review
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your String : ");
        String str = scan.next();
        stringPalindrome(str);

    }
    public static void stringPalindrome(String str) {
        String actualString = str;
StringBuffer reverseString = new StringBuffer();
        for(int i = actualString.length()-1;i>=0;i--){
            reverseString = reverseString.append(actualString.charAt(i));
        }

        System.out.println("reverse string is : " + reverseString);
        System.out.println("acutal string is :" + actualString);

        if(actualString.equals(reverseString.toString())) {
            System.out.println("It is a string palindrome");

        }
        else{
            System.out.println("Not a String Palindrome");
        }


    }
}
