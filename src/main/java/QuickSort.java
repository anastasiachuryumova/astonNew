import java.util.ArrayList;
import java.util.Comparator;

public class QuickSort {
    public static void main(String[] args) {
        ListItemComparator comp = new ListItemComparator();
        ArrayList<Object> list = new ArrayList<>();
        list.add("2");
        list.add("2");
        list.add("100");
        list.add("50");
        list.add("34");
        list.add("42");
        list.add("29");
        list.add("4");
        list.add("37");
        list.add("68");
        list.add("45");
        list.add("94");
        list.add("2");
        list.add("economic");
        list.add("drain");
        list.add("unused");
        list.add("descriptive");
        list.add("writer");
        list.add("quartz");
        list.add("materialistic");
        list.add("donkey");
        list.add("many");

        list.add(5, "100");
        list.add(14, "color");
        list.add(21, "sloppy");
        list.add(2, "abusive");
        list.add(12, "34");
        list.add(17, "34");
        list.add(7, "66");
        list.add(7, "writer");
        list.add(26, "writer");
        list.add(31, "writer");
        System.out.println(list);

        list.remove(15);
        list.remove("100");
        list.remove("abusive");
        list.remove("writer");
        list.remove("94");
        System.out.println(list);
        list.trimToSize();
        System.out.println(list);
    }
    static class ListItemComparator implements Comparator<ArrayList> {
        @Override
        public int compare(ArrayList o1, ArrayList o2) {
            return compare(o1, o2);
        }
    }


}
