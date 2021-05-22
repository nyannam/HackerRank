import java.util.Scanner;

public class isOddLambda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = scan.nextInt();
        ifElseTest(number);
    }

    private static void ifElseTest(int number) {
            if(number<=1 || number>=100){
                return;
            }
            else if(number%2!=0){
                System.out.println("Weird");
            }
            else if (number%2==0 &&(number>=2 && number<=5)){
                System.out.println("Not Weird");
            }
            else if (number%2==0 && (number>=6 && number<=20)){
                System.out.println("Not Weird");
            }
            else if(number%2==0 && number>20 ){
                System.out.println("Not Weird");
            }
        }

    }



