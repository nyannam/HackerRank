import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        System.out.println(array.length);
        System.out.println("Array is " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reverse array is " +Arrays.toString(array));
    }

    public static void reverseArray(int [] array) {
        int maxIndex=array.length-1;
        int halfArray=array.length/2;
        for(int i=0;i<halfArray;i++) {
            int temp=array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i]=temp;
        }

    }
}
