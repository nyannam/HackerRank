public class NumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(-222);
    }

    private static boolean isPalindrome(int number) {
        int reversedNumber=0;
        int lastDigit;
        int temp;
        temp=number;
        while(number!=0){
            lastDigit = number%10;
            reversedNumber = (reversedNumber*10)+lastDigit;
            number = number/10;
        }
        if(temp==reversedNumber){
            System.out.println(reversedNumber + " is palindrome");
            return true;
        }else{
            System.out.println(reversedNumber + " is not palindrome");
            return false;
        }
    }

}
