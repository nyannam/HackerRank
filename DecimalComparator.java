public class DecimalComparator {
    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(3.1756,3.1757);
    }

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        if((int)(param1*1000) ==(int)(param2*1000)){
            System.out.println("Both were same");
            return true;
        }
        else{
            System.out.println("not same");
        }
        return false;
    }
}
