public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,2));
    }

    private static boolean hasEqualSum(int i, int i1, int i2) {
        if(i+i1==i2){
            return true;
        }
        return false;
    }
}
