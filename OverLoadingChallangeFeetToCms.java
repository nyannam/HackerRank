public class OverLoadingChallangeFeetToCms
    /*1 feet = 12 inches
    * 1 inch = 2.54 cms
    * calculating 7 feet and 5 inches
    * (7 feet *12 inches)*2.54 = 213
    * 5 inches *2.54 = blah blah
    * total will be 226.06*/ {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(9, 5);
        calcFeetAndInchesToCentimeters(150);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("invalid values");
            return -1;
        } else {
            double centimeter = (feet * 12) * 2.54;
            centimeter += inches * 2.54;
            System.out.println(centimeter);
            return centimeter;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}
