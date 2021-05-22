import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice {

    public static void main(String[] args) {
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("sahith");
        listOfStrings.add("mom");
        listOfStrings.add("Dad");
        listOfStrings.add("geethu");

        for(String words:listOfStrings){
            System.out.println(words);
        }
Iterator<String> stringIterator = listOfStrings.iterator();
        while(stringIterator.hasNext()){
           if(stringIterator.next().endsWith("thu")){
               stringIterator.remove();
           }
        }
        System.out.println(listOfStrings);

        int[] sample = {2,3,6,5,4,7,8,7};

        System.out.println(sample.length);

    }


}
