public class EvenDigitSum {
    /*252 ->even numbers are 2 +2 in 252 which is 4*/

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-22));


    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int lastDigit=0;
        int sum=0;
        while(number!=0){
            lastDigit=number%10;
            if(lastDigit%2==0){
                sum+=lastDigit;
            }
            number=number/10;
        }
        return sum;
    }
}
