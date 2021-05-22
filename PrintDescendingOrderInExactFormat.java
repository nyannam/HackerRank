
import java.math.BigDecimal;
import java.util.*;

public class PrintDescendingOrderInExactFormat {

    /*printing numbers in descending order*/


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of list");
        int size = scan.nextInt();
        System.out.println("Enter the list of numbers");
        List<BigDecimal> bigDecimalList = new ArrayList<BigDecimal>();
        for(int i=0;i<=size;i++) {
            bigDecimalList.add(scan.nextBigDecimal());
        }
        System.out.println(getDescendingOrder(bigDecimalList));

    }


    private static Set<BigDecimal> getDescendingOrder(List<BigDecimal> bigDecimalList) {
        SortedSet<BigDecimal> bigDecimalSortedSet = new TreeSet<BigDecimal>(bigDecimalList);
        NavigableSet<BigDecimal> descending = ((TreeSet<BigDecimal>) bigDecimalSortedSet).descendingSet();
        return descending;

    }

}
