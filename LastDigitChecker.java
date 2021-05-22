public class LastDigitChecker {
    public static void main(String[] args) {

    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        int startDigit1=0;
        int startDigit2=0;
        int startDigit3=0;
        int lastDigit1=0;
        int lastDigit2=0;
        int lastDigit3=0;
        if(num1<10 || num1>=1000 || num2<10 || num2>=1000 || num3<10 || num3>=1000){
            return false;
        }
        startDigit1=num1/10;
        startDigit2=num2/10;
        startDigit3=num3/10;
        lastDigit1=num1%10;
        lastDigit2=num2%10;
        lastDigit3=num3%10;
        return false;
    }
}
