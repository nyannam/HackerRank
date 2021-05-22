import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractic {

    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(3,"sahith");
        hashMap.put(7,"amma");
        hashMap.put(5,"nanna");
        hashMap.put(2,"geethu");
        System.out.println("hashmap is" +hashMap);

        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3,"sahith");
        linkedHashMap.put(7,"amma");
        linkedHashMap.put(5,"nanna");
        linkedHashMap.put(2,"geethu");
        System.out.println("linkedHashMap is " + linkedHashMap);
        Map<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(3,"akka");
        treeMap.put(7,"sthothra");
        treeMap.put(2,"chinna");
        treeMap.put(5,"ram");

        System.out.println("treeMap is " + treeMap);
        System.out.println(treeMap.get(2));

    }
}
