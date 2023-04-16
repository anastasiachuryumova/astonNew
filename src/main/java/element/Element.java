package element;
/*
 * это класс для хранения элементов массива, они могут быть любые
 * он он расширяет строковый тип, иначе нам не удастся использовать метод equalTo
 * который работает только для строк
 */
public class Element<T extends String> implements Comparable<Element<T>> {
    /*
     * это хранимый элемент будущего массива
     */
    private T element;
    /*
     * это геттер элемента
     */
    public T getElement() {
        return element;
    }
    /*
     * это конструктор элемента
     */
    public Element(T element) {
        this.element = element;
    }
    /*
     * переопределяем метод toString, иначе элементы будут распечатываться по каким-то индексам
     */
    @Override
    public String toString() {
        return String.valueOf(element);
    }
    /*
     * переопределяем метод compareTo для работы Comparable
     */
    @Override
    public int compareTo(Element o) {
        if (element.chars().anyMatch(Character::isAlphabetic)) {
            /*
             * если у нас в элементе буквы, то сравниваем их по строковому типу
             */
            int result = this.element.compareTo(o.getElement());
            return result;
            /*
             * если у нас в элементе цифры, то сравниваем их по числовому типу
             */
        } else if (element.chars().anyMatch(Character::isDigit)) {
            Integer numberOne;
            Integer numberTwo;
            /*
             * чтобы привести строку к числу ловим исключение
             */
            try {
                numberOne = Integer.parseInt(this.element);
                numberTwo = Integer.parseInt(o.getElement());
            } catch (NumberFormatException e) {
                numberOne = 0;
                numberTwo = 0;
            }
            int result = Integer.compare(numberOne, numberTwo);
            return result;
        }
        return this.element.compareTo(o.getElement());
    }
}


