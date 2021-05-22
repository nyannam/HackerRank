public class SumFirstAndLastDigit {
    /*325->3+5->8*/
    public static void main(String[] args) {
        System.out.println( sumFirstAndLastDigit(325));
    }

    private static int sumFirstAndLastDigit(int number) {
      int lastNumber;
      int firstNumber=number;
      lastNumber=number%10;
        while(firstNumber>=10){
            firstNumber=firstNumber/10;
        }
        return lastNumber+firstNumber;
    }
}
