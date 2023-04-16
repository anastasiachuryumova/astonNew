package item;

import java.util.Arrays;
import java.util.Comparator;

public class Sort {
    public static void main(String[] args) {
        /*
         * это компаратор по элементам, далее мы сделаем его quicksort
         */
        Comparator<ListItem> comparator = new LIComparator();
        /*
         * это массив который мы будем сортировать
         */
        ListItem[] itemArray = new ListItem[11];
        itemArray[0] = new ListItem("23", 3);
        itemArray[1] = new ListItem("3", 5);
        itemArray[2] = new ListItem("17", 2);
        itemArray[3] = new ListItem("100", 0);
        itemArray[4] = new ListItem("76", 6);
        itemArray[5] = new ListItem("13", 11);
        itemArray[6] = new ListItem("13", 45);
        itemArray[7] = new ListItem("abc", 8);
        itemArray[8] = new ListItem("drain", 3);
        itemArray[9] = new ListItem("writer", 7);
        itemArray[10] = new ListItem("materialistic", 12);
        /*
         * здесь мы выводим сортировку в консоль
         * сначала по идентификатору с помощью метода compareTo
         * потом с помощью компаратора по элементам списка
         * потом с помощью компаратора по идентификаторам элементов
         * потом с помощью компаратора быстрой сортировки
         */
        Arrays.sort(itemArray);
        System.out.println(Arrays.toString(itemArray));
        Arrays.sort(itemArray, ListItem.ItemComparator);
        System.out.println(Arrays.toString(itemArray));
        Arrays.sort(itemArray, ListItem.IdComparator);
        System.out.println(Arrays.toString(itemArray));
        itemArray = quickSort(itemArray, 0, itemArray.length - 1, comparator);
        Arrays.sort(itemArray, comparator);
        System.out.println(Arrays.toString(itemArray));
    }
    /*
     * это метод быстрой сортировки
     */
    public static ListItem[] quickSort(ListItem[] itemArray, int left, int right, Comparator<ListItem> comparator) {
        int ll = left;
        int rr = right;

        if (rr > ll) {
            ListItem pivot = itemArray[(ll + rr) / 2];
            while (ll <= rr) {

                while (ll < right && comparator.compare(itemArray[ll], pivot) < 0) {
                    ll += 1;
                }
                while (rr > left && comparator.compare(itemArray[rr], pivot) > 0) {
                    rr -= 1;
                }
                if (ll <= rr) {
                    swap(itemArray, ll, rr);
                    ll += 1;
                    rr -= 1;
                }
            }
            if (left < rr) {
                quickSort(itemArray, left, rr, comparator);

            }
            if (ll < right) {
                quickSort(itemArray, ll, right, comparator);
            }
        }
        return itemArray;
    }
    /*
     * это метод перемены мест для быстрой сортировки
     */
    static void swap(Comparable[] arr, int l, int r) {
        Comparable t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
}

