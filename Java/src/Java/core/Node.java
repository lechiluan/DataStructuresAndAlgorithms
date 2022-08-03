package Java.core;

public class Node<E> {
    private E value;
    public Node<E> next; // pointer next
    public Node<E> previous; // pointer previous
    /*Create Node with  data type is E*/
    public Node(E value) {
        this.value =value;
    }
    /* Get value of Node */
    public E getValue() {
        return value;
    }
    /* Set value of Node */
    public void setValue(E value) {
        this.value = value;
    }
}


