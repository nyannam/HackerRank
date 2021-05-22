import java.util.HashMap;
import java.util.Map;

public class MapChallenge {

    //Create a String say "I am sahith, and I am a Software Developer working in John Deere in moline"
    //count the number of letters that were repeated and count the number of words that were repeated in a given string.


    public static void main(String[] args) {
        String str = "i am sahith, and i am a software developer working in john deere in moline";
        Map<Character,Integer> charOccurances = new HashMap<>();
        char[] chars = str.toCharArray();
        System.out.println(chars);
        for(char character:chars) {
           Integer integer = charOccurances.get(character);
           // System.out.println(integer);
           if(integer==null){
               charOccurances.put(character,1);
           }
           else{
               charOccurances.put(character,integer+1);
           }
        }
        System.out.println(charOccurances);
    Map<String,Integer> strOccurances = new HashMap<>();
    String[] words=str.split(" ");
        System.out.println(words);
    for(String word:words){
        Integer strInt = strOccurances.get(word);
        if(strInt==null){
            strOccurances.put(word,1);
        }else{
            strOccurances.put(word,strInt+1);
        }
    }
        System.out.println(strOccurances);

    }
}
