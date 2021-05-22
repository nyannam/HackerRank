public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    private static boolean hasSharedDigit(int num1, int num2) {
        int reverse1 = 0;
        int reverse2 = 0;
        int firstdigit1 = 0;
        int firstdigit2 = 0;
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        } else {
            reverse1 = num1 % 10;
            reverse2 = num2 % 10;
            firstdigit1 = num1 / 10;
            firstdigit2 = num2 / 10;
            if ((reverse1 == reverse2) || (firstdigit1 == firstdigit2) || (reverse1 == firstdigit2) || (reverse2 == firstdigit1)) {
                return true;
            }
        }
        return false;
    }
}
