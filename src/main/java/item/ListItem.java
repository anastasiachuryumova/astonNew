package item;

import java.util.Comparator;

public class ListItem implements Comparable<ListItem>{
    /*
    * в этом классе мы создаем элементы, которые будем сравнивать
    * у них будут поля непосредственно элемент и идентификатор
    */
    private String item;
    private int id;

    /*
     * это геттеры для элемента и идентификатора
     */

    public String getItem(){
        return item;
    }

    public int getId(){
        return id;
    }
    /*
     * это конструктор для элемента и идентификатора
     */
    public ListItem(String item, int id){
        this.item = item;
        this.id = id;
    }
    /*
     * это метод для написания элементов массива
     */
    @Override
    public String toString() {
        return this.id + "-" + this.item;
    }
    /*
     * это метод сравнения идентификаторов чтобы идентификаторы выстраивались в порядке
     */
    @Override
    public int compareTo(ListItem id) {
        return this.id - id.id;
    }
    /*
     * это компаратор по идентификаторам
     */
    public static Comparator<ListItem> IdComparator = new Comparator<ListItem>() {

        @Override
        public int compare(ListItem e1, ListItem e2) {
            return e1.getId() - e2.getId();
        }
    };
    /*
     * это компаратор по элементам
     */
    public static Comparator<ListItem> ItemComparator = new Comparator<ListItem>() {

        @Override
        public int compare(ListItem e1, ListItem e2) {
            return e1.getItem().compareTo(e2.getItem());
        }
    };
}

