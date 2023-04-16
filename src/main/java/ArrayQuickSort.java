import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

public class ArrayQuickSort {
    public static void main(String[] args) {
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

        if (list.size() == 0)
            return;//завершить выполнение, если длина массива равна 0

        System.out.println(list.stream().collect(Collectors.toList()));
        list.stream().collect(Collectors.toList());

        //list.sort(Comparator.comparing(list.lastIndexOf(list.get(0)));
        //Object low = list.get(0);
        //Object high = list.get(list.size() - 1);
//        int low = Integer.valueOf(String.valueOf(list.get(0)));
//        int high = Integer.valueOf(String.valueOf(list.get(list.size() - 1)));
//
//        if Comparator.comparing(low, high)<0
//        return;//завершить выполнение если уже нечего делить
//
//                // выбрать опорный элемент
//                int middle = low + (high - low) / 2;
//                int pivot = (int) list.get(middle);
//
//                // разделить на подмассивы, который больше и меньше опорного элемента
//                int i = low, j = high;
//                while (i <= j) {
//                    while (list.get(i) < pivot) {
//                        i++;
//                    }
//
//                    while (list[j] > pivot) {
//                        j--;
//                    }
//
//                    if (i <= j) {//меняем местами
//                        int temp = list[i];
//                        list[i] = list[j];
//                        list[j] = temp;
//                        i++;
//                        j--;
//                    }
//                }
//
//                // вызов рекурсии для сортировки левой и правой части
//                if (low < j)
//                    quickSort(array, low, j);
//
//                if (high > i)
//                    quickSort(array, i, high);
//
//                int[] x = {8, 0, 4, 7, 3, 7, 10, 12, -3};
//                System.out.println("Было");
//                System.out.println(Arrays.toString(x));
//
//                int low = 0;
//                int high = x.length - 1;
//
//                quickSort(x, low, high);
//                System.out.println("Стало");
//                System.out.println(Arrays.toString(x));
//
//            }
//        }
    }
}
