public class TeenNumberChecker {
    public static void main(String[] args) {
isTeen(7);
hasTeen(0,0,0);
    }
   public static boolean hasTeen(int age1,int age2, int age3){
        if((age1>=13 && age1<=19) || (age2>=13 && age2<=19) || (age3>=13 && age3<=19)){
            return true;
        }
        return false;
   }
   public static boolean isTeen(int age1) {
       if(age1>=13 && age1<=19){
           System.out.println("true is returning");
           return true;
       }else{
           System.out.println("false is returing");
           return false;
       }
   }
}
