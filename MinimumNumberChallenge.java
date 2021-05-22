import java.util.Scanner;

public class MinimumNumberChallenge {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scan.nextInt();
        scan.nextLine();
        int [] numbers = readIntegers(count);
        int min = findMin(numbers);
        System.out.println("min = " + min);
    }

    public static int[] readIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println(" Please enter " + capacity + " Integer values");
        for(int i=0;i<array.length;i++) {
           int number= scan.nextInt();
           scan.nextLine();
           array[i] = number;


        }
        return array;
    }

    public static int findMin(int[] array) {
      int min=Integer.MAX_VALUE;
      //3,4,5
      for(int i=0;i<array.length;i++){
          int value = array[i];
          if(value < min){

              min=value;
          }
      }
      return min;
    }
}
