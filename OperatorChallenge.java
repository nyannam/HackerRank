public class OperatorChallenge {

    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;
        double var3 = ( var1 + var2 ) * 100.00;
        double var4 = var3%40.00;
        boolean isRemainderZero = (var4==0)?true:false;
        System.out.println(isRemainderZero);
        if(isRemainderZero!=true){
            System.out.println("Got some remainder");
        }
    }
}
