import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Sahith");
        names.add("sam");
        names.add("raj");
        names.add("uday");
        names.add("prathik");

        ListIterator<String> stringListIterator = names.listIterator();
        while(stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }
        while(stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }
        /*Iterator<String> itr = names.iterator();
        while (itr.hasNext()) {
            System.out.println("names are " + itr.next());
        }
        itr = names.iterator();
        System.out.println("=========== 2nd time ============");
        while (itr.hasNext()) {
            String name = itr.next();
            if(name.equals("prathik")){
                itr.remove();

            }
        }
        System.out.println("after removing name");
        itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(" names are " +itr.next());
        }*/
    }
}

