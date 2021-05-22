public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(10.25);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
      return Math.round(kilometersPerHour/1.609);

    }

    public static void printConversion(double kilometersPerhour){
        if(kilometersPerhour<0){
            System.out.println("Invalid value");
        }else {
           long milesPerHour = toMilesPerHour(kilometersPerhour);
            System.out.println(kilometersPerhour + " km/h = " + milesPerHour + " mi/h" );

        }
    }
}
