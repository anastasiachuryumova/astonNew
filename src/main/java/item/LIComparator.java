package item;

import java.util.Comparator;

public class LIComparator implements Comparator<ListItem> {
    /*
     * это класс компаратора для быстрой сортировки
     */
        @Override
        public int compare(ListItem o1, ListItem o2) {
        return o1.getItem().compareTo(o2.getItem());
    }
}

