import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        String original;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the string ");
        original = scan.nextLine();
        findReverseString(original);
    }

    private static void findReverseString(String original) {
        String reverseString="";
        int length = original.length();
        for(int i=length-1;i>=0;i--){
            reverseString = reverseString + original.charAt(i);
        }
        System.out.println("The reverse of the String you entered is " + reverseString);
    }


}
