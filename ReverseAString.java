public class ReverseAString {

    public static void main(String[] args) {
        String input = "Utah Forever";

        char[] c = input.toCharArray();
        System.out.println(c);
        System.out.println(input.length());
        for(int i=input.length()-1;i>=0;i--){
           System.out.println(c[i]);
        }
    }
}
