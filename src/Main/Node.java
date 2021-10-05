package Main;
/**
 * Класс звено со свойствами <b>next</b> и <b>value</b>.
 * @author  Вадим Таратонов
 * @version 1.1
 */
public class Node {
    /** Поле указатель на следующий узел */
    Node next;
    /** Поле значение */
    int value;
    /**
     * Конструктор - создание нового звена
     * @see Node#Node(int)
     */
    public Node() {}
    /**
     * Конструктор - создание нового звена с определенным значением
     * @param value - значение
     * @see Node#Node()
     */
    public Node(int value) { //конструктор с параметром
        this.value = value;
        this.next = null;
    }
    
}
