import java.util.Scanner;

public class BigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first big integer");
        java.math.BigInteger a = scan.nextBigInteger();
        System.out.println("Please enter second big integer");
        java.math.BigInteger b = scan.nextBigInteger();

        java.math.BigInteger add = a.add(b);
        java.math.BigInteger multiply = a.multiply(b);
        System.out.println("addition is  " + add + " multiplication is + " + multiply);


    }
}
