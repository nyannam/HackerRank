import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int count=0;
int sum=0;
while(true) {
    int order = count + 1;
    System.out.println("Enter number # " + order + " : ");
    boolean hasNextInt = scan.hasNextInt();
    if (hasNextInt) {
        int number = scan.nextInt();
        sum += number;
        count++;
        if (count == 10) {
            break;
        }
    } else {
        System.out.println("Invalid value");
    }
    scan.nextLine();
}
        System.out.println("total is  " + sum);
        scan.close();

    }
}
