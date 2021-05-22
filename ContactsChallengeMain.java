import java.util.Scanner;

public class ContactsChallengeMain {
   private static Scanner scan = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("222222222");
    public static void main(String[] args) {
boolean quit = false;
startPhone();
printActions();
while(!quit) {

}

    }
    private static void startPhone() {
        System.out.println("Starting phone...");
    }
    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
       /* System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "1 - to print contacts\n" +;*/
    }
}
