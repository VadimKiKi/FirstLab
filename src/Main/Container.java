package Main;
/**
 * Класс контейнер со свойствами <b>first</b> и <b>second</b>.
 * @author  Вадим Таратонов
 * @version 1.1
 */

public class Container {
    /** Поле указатель на первый элемент */
    private Node first;
    /** Поле указатель на последний элемент */
    private Node last;

    /**
     * Конструктор - создание нового элемента
     */
    public Container() {
        first = null;
        last = null;
    }

    /**
     * Функция проверки на пустоту
     * @return возвращает значение типа bool пустоты списка
     */
    public boolean isEmpty() {
        return first == null;
    }

    /**
     * Функция получения длинны списка
     * @return возвращает значение длинны списка
     */
    public int getLength() { //получить длинну списка
        int length = 0;
        Node p = first;
        if (isEmpty()) {
            return length;
        }
        while (p.next != null) {
            p = p.next;
            length++;
        }
        return length;
    }

    /**
     * Функция добавления элемента в конец списка
     * @param value - элемент
     * @see Container#pushEl(int, int)
     * @see Container#pushFront(int)
     */
    public void pushBack(int value) {
        Node p = new Node(value);
        if (isEmpty())
        {
            first = p;
            last = p;
        } else {
            last.next = p;
            last = p;
        }
    }

    /**
     * Функция добавления элемента в начало списка
     * @param value - элемент
     * @see Container#pushEl(int, int)
     * @see Container#pushBack(int)
     */
    public void pushFront(int value) {
        Node p = new Node(value);
        if(isEmpty())
        {
            first = p;
            last = p;
        }
        else {
            p.next = first;
            first = p;
        }

    }

    /**
     * Функция добавления элемента на позицию после указанной
     * @param position - позиция добавления
     * @param value - элемент
     * @throws Exception ошибка некорректного позиции
     * @see Container#pushBack(int)
     * @see Container#pushFront(int)
     */
    public void pushEl (int position, int value) throws Exception {
        int index = 0;
        if (position >= 0 && position <= this.getLength()) {
            Node p = first;
            while (index != position) {
                p = p.next;
                index++;
            }
            if (index == 0) {
                pushFront(value);
            } else if (index == this.getLength()) {
                Node a = new Node();
                a.value = last.value;
                last.next = a;
                last.value = value;
                last = a;
            } else {
                Node a = new Node();
                a.value = p.value;
                a.next = p.next;
                p.value = value;
                p.next = a;
            }


        } else throw new Exception("Incorrect position");
    }

    /**
     * Функция удаления последнего элемента
     * @throws Exception ошибка пустого списка
     * @see Container#delFront()
     * @see Container#delEl(int)
     */
    public void delBack() throws Exception {
        if (isEmpty()) {
           throw new Exception ("Empty list");
        }

        if (first == last) {
            first = null;
            last = null;
            return;
        }
        Node p = first;
        while (p.next != last)
            p = p.next;
        p.next = null;
        last = p;
    }

    /**
     * Функция удаления первого элемента
     * @throws Exception ошибка пустого списка
     * @see Container#delEl(int)
     * @see Container#delBack()
     */
    public void delFront() throws Exception { //удаление первого
        if (isEmpty()) {
            throw new Exception ("Empty list");
        }
        if (first == last) {
            first = null;
            last = null;
            return;
        }
        first = first.next;
        return;
    }

    /**
     * Функция удаления элемента по значению
     * @param value - элемент
     * @throws Exception ошибка пустого списка
     * @see Container#delBack()
     * @see Container#delFront()
     */
    public void delEl(int value) throws Exception {
        if (isEmpty()) {
            throw new Exception ("Empty list");
        }

        if (first == last) {
            first = null;
            last = null;
            return;
        }

        if (first.value == value) {
            delFront();
            return;
        }
        if (last.value == value) {
            delBack();
            return;
        }

        Node t = first;
        while (t.next != null) {
            if (t.next.value == value) {
                if(last == t.next)
                {
                    last = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }

    }

    /**
     * Функция печати списка
     * @return возвращает полученный список в виде строк
     */
    @Override
    public String toString() {
        if (isEmpty()) {
            return "Empty list";
        }
        String result = "";
        Node p = first;
        while (p != null)
        {
            result += p.value + " ";
            p = p.next;
        }
        return result;
    }

    /**
     * Функция поиска элемента
     * @param position позиция искомого элемента
     * @return возвращает значение искомого элемента
     * @throws Exception ошибка пустого списка или некорректной позиции
     */
    public int findEl(int position) throws Exception {
        if (isEmpty()) {
            throw new Exception ("Empty list");
        }
        int index = 0;
        if (position >= 0 && position <= this.getLength()) {
            Node p = first;
            while (index != position) {
                p = p.next;
                index++;
            }
            return p.value;
        }
        else throw new Exception("Incorrect position");
    }
}
