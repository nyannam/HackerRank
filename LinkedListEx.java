
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx
{
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Silverspring");
        addInOrder(placesToVisit, "Dayton");
        addInOrder(placesToVisit, "SaltlateCity");
        addInOrder(placesToVisit, "Tampa");
        addInOrder(placesToVisit, "Richmond");
        addInOrder(placesToVisit, "Louisville");
        addInOrder(placesToVisit, "Moline");
        addInOrder(placesToVisit, "Moline");
        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> linkedList) {

 for(int i=0;i<linkedList.size();i++) {
            System.out.println("Now visiting " + linkedList.get(i));
        }

       Iterator<String> itr = linkedList.iterator();
       while(itr.hasNext()){
           System.out.println("Now visiting " +itr.next());
       }
        System.out.println("===============");

    }
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while(stringListIterator.hasNext()){
            int comparision = stringListIterator.next().compareTo(newCity);
            if(comparision==0){
                System.out.println(newCity + " was already on the list ");
                return false;
            }else if(comparision>0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if(comparision<0) {

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

}
