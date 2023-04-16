package element;

import java.util.ArrayList;

public class Order {
    public static void main(String[] args) {
        /*
         * создаем массив элементов, наполнять не обязательно, здесь для наглядности
         */
        ArrayList<Element> elementArray = new ArrayList<>();
        elementArray.add(new Element("abc"));
        elementArray.add(new Element("drain"));
        elementArray.add(new Element("100"));
        elementArray.add(new Element("2"));
        elementArray.add(new Element("76"));
        elementArray.add(new Element("writer"));
        elementArray.add(new Element("13"));
        elementArray.add(new Element("winter"));
        elementArray.add(new Element("d13"));
        elementArray.add(new Element("materialistic"));
        /*
         * распечатываем массив без сортировки
         */
        System.out.println(elementArray);
        /*
         * сортируем и распечатываем
         */
        quickSort(elementArray, 0, elementArray.size()-1);
        //System.out.println(elementArray);
        for (Element element : quickSort(elementArray, 0, elementArray.size() - 1)) {
            System.out.println(element);
        }
    }
    /*
     * это метод быстрой сортировки
     */
    public static ArrayList<Element> quickSort(ArrayList<Element> elementArray, int start, int end) {
        // индекс для сканирования слева направо
        int i = start;
        // индекс для сканирования справа налево
        int j = end;
        // только для массивов более двух элементов
        if (j - i >= 1) {
            // опорная точка метода сортировки пусть будет первый элемент
            Element pivot = elementArray.get(i);
            // сравниваем два индекса пока не останется элементов
            while (j > i) {
                // слева, если текущий элемент лексикографически меньше исходного
                // первый элемент в массиве String, двигаемся дальше. Останавливаем счетчик, когда мы достигнем
                // правого элемента или элемента, который лексикографически больше, чем опорный.
                while (elementArray.get(i).compareTo(pivot) <= 0 && i < end && j > i) {
                    i++;
                }
                // справа, если текущий элемент лексикографически больше исходного
                // первый элемент в массиве String, двигаемся дальше. Останавливаем счетчик, когда мы достигнем
                // левый или элемент, который лексикографически меньше, чем опорный.
                while (elementArray.get(j).compareTo(pivot) >= 0 && j > start && j >= i) {
                    j--;
                }
                // проверьте два элемента в центре, последнее сравнение перед пересечением сканирований.
                if (j > i)
                    swap(elementArray, i, j);
            }
            // На этом этапе два сканирования пересекаются друг с другом в центре массива и останавливаются.
            // Левый раздел и правый раздел содержат правильные группы чисел, но сами по себе не
            // отсортированы. Следующий рекурсивный код сортирует левый и правый разделы.

            // Поменяйте опорный элемент местами с последним элементом левой секции.
            swap(elementArray, start, j);
            // сортируем левый раздел
            quickSort(elementArray, start, j - 1);
            // сортируем правый раздел
            quickSort(elementArray, j + 1, end);
        }
        return elementArray;
    }

    /**
     * Этот метод облегчает необходимость замены двух элементов
     */
    private static void swap(ArrayList<Element> elementArray, int i, int j) {
        Element temp = elementArray.get(i);
        elementArray.set(i, elementArray.get(j));
        elementArray.set(j, temp);
    }
}

