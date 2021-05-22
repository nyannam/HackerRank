public class DigitSumChallange {

    /*sumDigits(125) = 1+2+5 =8*/

    public static void main(String[] args) {
        sumDigits(125);

    }
   public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum = 0;
        while(number>0){
            sum+= number%10;
            number=number/10;
        }
        return sum;
    }
}
