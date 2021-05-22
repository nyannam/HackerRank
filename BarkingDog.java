public class BarkingDog {

    public static void main(String[] args) {
        shouldWakeUp(true,22);
    }

   public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
       if (hourOfDay < 0 || hourOfDay >23) {
           System.out.println("Each day has 24 hours, please enter valid hours within 24 and try again");
           return false;
       } else if (barking == true && hourOfDay > 0 && hourOfDay < 8) {
           System.out.println("please wake up, Dog is barking");
           return true;
       } else if(barking==true &&  hourOfDay>22 && hourOfDay<=23){
           System.out.println("returned .....");
           return true;
       }
           return false;
   }
}
