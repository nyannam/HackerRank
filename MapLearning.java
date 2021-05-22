import java.util.HashMap;
import java.util.Map;

public class MapLearning {


    //Create a String say "I am sahith, and I am a Software Developer working in John Deere in moline"
    //count the number of letters that were repeated and count the number of words that were repeated in a given string.


    public static void main(String[] args) {
        String str = "I am sahith, and I am a Software Developer working in John Deere in moline";
        Map<Character,Integer> map = new HashMap<>();
        char [] chars = str.toCharArray();
        System.out.println(chars);

        for(Character character : chars) {
            Integer integer = map.get(character);
            if(integer==null) {
                map.put(character,1);
            }else{
                map.put(character, integer+1);
            }
        }
        System.out.println(map);
        Map<String,Integer> stringMap = new HashMap<>();
        String[] strings = str.split(" ");
        for(String string:strings) {
            Integer integer = stringMap.get(string);
            if(integer==null){
                stringMap.put(string,1);
            }else{
                stringMap.put(string,integer+1);
            }
        }
        System.out.println(stringMap);

    }
}
