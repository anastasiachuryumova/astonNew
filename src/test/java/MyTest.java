import element.Element;
import element.Order;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class MyTest {

    @Test
    public void shouldOrderBeCorrect() {
        ArrayList<Element> elementArray = new ArrayList<>();
        /*
         * передаем массив
         */
        elementArray.add(new Element("day"));
        elementArray.add(new Element("78"));
        elementArray.add(new Element("8"));
        elementArray.add(new Element("2"));
        elementArray.add(new Element("492"));
        elementArray.add(new Element("color"));
        elementArray.add(new Element("c"));
        elementArray.add(new Element("night"));
        elementArray.add(new Element("d"));
        elementArray.add(new Element("field"));
        elementArray.add(new Element("e"));
        /*
         * печатаем его в неотсортированном виде, затем в отсортированном
         */
        System.out.println(elementArray);
        System.out.println(Order.quickSort(elementArray, 0, elementArray.size() - 1));
        Order.quickSort(elementArray, 0, elementArray.size() - 1);
        /*
         * передаем второй массив, для проверки, он такой же как превый отсортированный
         */
        ArrayList<Element> elementArray1 = new ArrayList<>();
        elementArray1.add(new Element("2"));
        elementArray1.add(new Element("8"));
        elementArray1.add(new Element("78"));
        elementArray1.add(new Element("492"));
        elementArray1.add(new Element("c"));
        elementArray1.add(new Element("color"));
        elementArray1.add(new Element("d"));
        elementArray1.add(new Element("day"));
        elementArray1.add(new Element("e"));
        elementArray1.add(new Element("field"));
        elementArray1.add(new Element("night"));
        /*
         * печатаем второй массив
         */
        System.out.println(elementArray1);
        /*
         * приводим массивы к сторкам, иначе метод assertArrayEquals смотрит что в двух массивах
         * индекс первых элементов разный, и говорит, что они разные, хотя элементы идентичны
         */
        String Array = elementArray.toString();
        String AnotherArray = elementArray1.toString();
        /*
         * используем assert
         */
        Assertions.assertEquals(Array, AnotherArray, "порядок неправильный");
    }
}

