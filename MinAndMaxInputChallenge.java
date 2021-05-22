import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min=0;
        int max=0;
        boolean first=true;
        while(true) {
            System.out.println("Enter number: ");
            boolean hasNextInt = scan.hasNextInt();
            if(hasNextInt){
                int number = scan.nextInt();
                if(first){
                    first=false;
                    min=number;
                    max=number;
                }
                 if(number>max){
                     max = number;
                 }
                 if (number<min) {
                     min = number;
                 }
            }else{
                System.out.println("Invalid value");
                break;
            }
            scan.nextLine();
        }
        System.out.println(" min= "+ min + " max = " + max );
        scan.close();
    }
}
